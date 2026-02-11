package bus_management_system_v.pkg1.pkg0;

import java.util.Scanner;

public class Admin extends Client{

    String userName, pass;
    Scanner input = new Scanner(System.in);

    int checkAdmin() {

        System.out.println("Enter username : ");
        System.out.print("=>");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        pass=input.nextLine();
           System.out.print("=>");
        if(userName.equals("Root")&&pass.equals("Admin"))
        {
            return 1;
        }
        else{
            return 0;
        }
        

        
        
    }

}
