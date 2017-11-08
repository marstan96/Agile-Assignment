package agile;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import da.affiliatesDA;
import domain.Affiliates;
import Control.MaintainAffiliates;
import da.MenuDA;
import domain.Menu;
import Control.MaintainMenu;

public class Agile {

    private MaintainAffiliates affiliatesDetails = new MaintainAffiliates();
    private MaintainMenu menuDetails = new MaintainMenu();

    public void Registration() {
        String id = affiliatesDetails.readID().getAffiliatesID(); // Get the last menuID from database
        int number = Integer.parseInt(id.substring(1, 5)); // Get the behind four digit
        number += 1; // id + 1, Example: 1001 + 1 = 1002
        String word = id.substring(0, 1); // Get the first letter 'M'
        String ID = String.valueOf(word + number); // Get the first letter 'M' + the behind four digit

        Scanner input = new Scanner(System.in);
        String name;
        String num;
        int back;
        System.out.println("Registration");
        System.out.println("------------");
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("\n");
        System.out.print("Enter Your Phone Number: ");
        num = input.nextLine();
        System.out.print("\n");
        System.out.println("Congratulation! Now you are the one of DeliveryMen.");
        System.out.print("\n");

        //Affiliates details = new Affiliates(ID, name, num);
        //affiliatesDetails.addCustomerDetails(details);
        System.out.print("Enter Your Phone Number: ");
        back = input.nextInt();
        if(back == 0)
        {
            
        }
        
    }

    public void ReadItem() {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Menu");
        System.out.println("--------");
        ArrayList<Menu> menuList = menuDetails.getAllMenu();
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i + 1 + ". " + menuList.get(i).getMenuName() + " " + menuList.get(i).getMenuType() + " " + "RM " + menuList.get(i).getMenuPrice() + " " + menuList.get(i).getStatus());
        }
        System.out.println("1. Delete the item");
        System.out.println("Go back previous page. Please choose 2");
        System.out.println("Enter your number: ");
        number = input.nextInt();
        if (number == 1) {
            DeleteItem();
        }
        else if(number  == 2)
        {
            System.exit(0);
        }

    }

    public void AddItem() {
        String id = menuDetails.readID().getMenuID(); // Get the last menuID from database
        int number = Integer.parseInt(id.substring(1, 5)); // Get the behind four digit
        number += 1; // id + 1, Example: 1001 + 1 = 1002
        String word = id.substring(0, 1); // Get the first letter 'M'
        String ID = String.valueOf(word + number); // Get the first letter 'M' + the behind four digit
        Scanner input = new Scanner(System.in);
        String name;
        String price;
        String type;
        String status;
        System.out.println("Add Item");
        System.out.println("--------");
        System.out.print("Enter The Food's Name: ");
        name = input.nextLine();
        System.out.print("\n");
        System.out.print("Enter The Food's Type: ");
        type = input.nextLine();
        System.out.print("\n");
        System.out.print("Enter The Food's Price: ");
        price = input.nextLine();
        System.out.print("\n");
        System.out.print("Enter The Food's Price: ");
        status = input.nextLine();
        System.out.print("\n");
        System.out.println("Congratulation! Have the newest item.");
        System.out.print("\n");
        Menu details = new Menu(ID, type, name, Double.parseDouble(price), status);
        menuDetails.addMenuDetail(details);
    }

    public void DeleteItem() {
        Scanner input = new Scanner(System.in);
        String id;
        int delete;
        System.out.println("Delete Item");
        System.out.println("--------");
        System.out.print("Enter number which food you want to delete: ");
        delete = input.nextInt();
        if(delete == 1)
        {
            id = "M1001";
            Menu details = new Menu(id);
        menuDetails.deleteRecord(details);
        }
        System.out.print("\n");
        System.out.println("Congratulation! Have the delete item.");
        System.out.print("\n");
        
        
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        Agile agile = new Agile();

        do{
            System.out.println("1. Registration");
            System.out.println("2. Menu List");
            System.out.println("Choose the list: ");
            number = input.nextInt();
            if (number == 1) {
                agile.Registration();
            } else if (number == 2) {
                System.out.println("1. Read the menu");
                System.out.println("2. Add the item");
                System.out.print("Choose the list: ");
                number = input.nextInt();
                if (number == 1) {
                    agile.ReadItem();
                } else if (number == 2) {
                    agile.AddItem();
                }

            }
        }while(number!=0);
        }
    

}
