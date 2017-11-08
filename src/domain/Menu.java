package domain;

import java.io.Serializable;

public class Menu implements Serializable {

    private String menuID;
    private String menuType;
    private String menuName;
    private Double menuPrice;
    private String status;
    
    public Menu(String menuID, String menuName, String menuType,  Double menuPrice, String status) {
        this.menuID = menuID;
        this.menuType = menuType;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.status = status;
    }
    
    public Menu(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuID() {
        return menuID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }
}
