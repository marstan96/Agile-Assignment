package Control;

import da.MenuDA;
import domain.Menu;
import java.util.ArrayList;

public class MaintainMenu {

    private MenuDA menuDA;

    public MaintainMenu() {
        menuDA = new MenuDA();
    }

    public void addMenuDetail(Menu details) {
        menuDA.addMenuDetail(details);
    }

    public ArrayList<Menu> getAllMenu() {
        ArrayList<Menu> menuList = menuDA.getAllMenu();
        return menuList;
    }

    public Menu readMenuDetail(String menuID) {
        return menuDA.readMenuDetail(menuID);
    }

    public void updateRecord(Menu menu) {
        menuDA.updateDetail(menu);
    }
    
    public void deleteRecord(Menu menu) {
        menuDA.deleteDetail(menu);
    }

    public Menu readID() {
        return menuDA.readID();
    }


}
