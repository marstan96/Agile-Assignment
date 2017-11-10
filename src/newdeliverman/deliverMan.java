package newdeliverman;

import java.io.Serializable;
/**
 *
 * @author JunWeng
 */
public class deliverMan implements Serializable{
    private static int dmID = 1;
    private int ID;
    private String name;
    private String address;
    private String contactNo;
    

   
    
    public deliverMan (int ID){
        this.ID = ID;
    }
    
    public deliverMan (String name, String address, String contactNo){
        this.name=name;
        this.address=address;
        this.contactNo=contactNo;
        this.ID = dmID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public static int getDmID() {
        return dmID;
    }

    public static void setDmID(int dmID) {
        deliverMan.dmID = dmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
   @Override
  public String toString() {
    return String.format("%-10d %-50s\n", ID, name);
  }
    
}
