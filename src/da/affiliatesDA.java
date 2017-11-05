package da;

import domain.Affiliates;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class affiliatesDA {

    private String host = "jdbc:derby://localhost:1527/agile";
    private String user = "agile";
    private String password = "agile";
    private String tableName = "AFFILIATES";
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public affiliatesDA() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(host, user, password);
            // stmt = conn.prepareStatement(sqlQueryStr);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void addAfiliatesDetails(Affiliates customerDetails) {

        String queryStr = "INSERT INTO " + tableName + " VALUES (?, ?, ?, ?, ?, ?)";

        try {

            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, customerDetails.getAffiliatesID());
            stmt.setString(2, customerDetails.getAffiliatesName());
            stmt.setString(3, customerDetails.getAffiliatesICNumber());
            stmt.setString(4, customerDetails.getPhoneNumber());
            stmt.setInt(5, customerDetails.getAffiliatesAge());
            stmt.setString(6, customerDetails.getAffiliatesGender());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public Affiliates readID() {
        String queryStr = "SELECT * FROM " + tableName + " ORDER BY ID DESC";
        Affiliates affiliates = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                affiliates = new Affiliates(rs.getString("ID"));
            }
        } catch (SQLException ex) {
        }
        return affiliates;
    }
}
