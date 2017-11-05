package da;

import domain.Menu;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class MenuDA {

    private String host = "jdbc:derby://localhost:1527/agile";
    private String user = "agile";
    private String password = "agile";
    private String tableName = "MENU";
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public MenuDA() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(host, user, password);
            // stmt = conn.prepareStatement(sqlQueryStr);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addMenuDetail(Menu m) {

        String queryStr = "INSERT INTO " + tableName + " VALUES (?, ?, ?, ?, ?)";

        try {

            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, m.getMenuID());
            stmt.setString(2, m.getMenuID());
            stmt.setString(3, m.getMenuName());
            stmt.setDouble(4, m.getMenuPrice());
            stmt.setString(5, m.getStatus());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ArrayList<Menu> getAllMenu() {
        ArrayList<Menu> allMenu = new ArrayList<Menu>();
        Menu menu = null;
        String queryStr = "SELECT * FROM " + tableName;
        try {
            stmt = conn.prepareStatement(queryStr);
            rs = stmt.executeQuery();

            while (rs.next()) {

                allMenu.add(new Menu(rs.getString("MENUID"), rs.getString("MENUNAME"), rs.getString("MENUTYPE"), rs.getDouble("MENUPRICE"), rs.getString("MENUSTATUS")));
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }

        return allMenu;
    }

    public Menu readMenuDetail(String menuID) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE MENUID = ?";
        Menu menu = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, menuID);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                menu = new Menu(rs.getString("MENUID"), rs.getString("MENUNAME"), rs.getString("MENUTYPE"), rs.getDouble("MENUPRICE"), rs.getString("STATUS"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return menu;
    }

    public Menu updateDetail(Menu menu) {
        String queryStr = "UPDATE " + tableName + " SET MENUNAME = ?, MENUTYPE = ?, MENUPRICE = ?, STATUS = ? WHERE MENUID = ?";

        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, menu.getMenuName());
            stmt.setString(2, String.valueOf(menu.getMenuType()));
            stmt.setDouble(3, menu.getMenuPrice());
            stmt.setString(4, menu.getStatus());
            stmt.setString(5, menu.getMenuID());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return menu;
    }

    public Menu deleteDetail(Menu menu) {
        String queryStr = "UPDATE " + tableName + "WHERE MENUID = ?";
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, menu.getMenuID());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return menu;
    }

    public Menu readID() {
        String queryStr = "SELECT * FROM " + tableName + " ORDER BY MENUID DESC";
        Menu menu = null;
        try {
            stmt = conn.prepareStatement(queryStr);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                menu = new Menu(rs.getString("MENUID"), rs.getString("MENUNAME"), rs.getString("MENUTYPE"), rs.getDouble("MENUPRICE"), rs.getString("STATUS"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return menu;
    }
}
