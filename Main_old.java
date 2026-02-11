/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_management_system_v.pkg1.pkg0;

import java.util.Scanner;

public class Main_old {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Destination[] d = new Destination[100];
        Client[] c = new Client[100];
        Bus[] b = new Bus[100];
        int max_Client = 0, max_Destination = 0, x = -1, max_Bus = 0;

        while (x != 0) {
            System.out.println("1. Add destination and cost");
            System.out.println("2. Add Bus Information ");
            System.out.println("3. Add User Account ");
            System.out.println("4. View all destionations with cost");
            System.out.println("5. View all Client information");
            System.out.println("6. View bus information");

            System.out.println("0. Exit");
            System.out.println("Enter your choice ");
            System.out.print("=> ");
            x = input.nextInt();
            input.nextLine();

            if (x == 1) {
                String destination;
                int price, l;
                System.out.println("Enter total number of destinations");
                System.out.print("=> ");
                l = input.nextInt();
                input.nextLine();
                // max_Destination = l;

                for (int i = max_Destination; i < max_Destination + l; i++) {
                    System.out.println("Enter destination name ");
                    System.out.print("=> ");
                    destination = input.nextLine();
                    System.out.println("Enter destination cost");
                    System.out.print("=> ");
                    price = input.nextInt();
                    input.nextLine();
                    d[i] = new Destination();

                    d[i].set_destination(destination, price);

                }
                max_Destination += l;
            }
            if (x == 3) {
                String name, email, phone;
                int l;
                System.out.println("Enter total user number");
                System.out.print("=> ");
                l = input.nextInt();
                input.nextLine();

                for (int i = max_Client; i < max_Client + l; i++) {
                    System.out.println("Enter User name ");
                    System.out.print("=> ");
                    name = input.nextLine();
                    System.out.println("Enter User email ");
                    System.out.print("=> ");
                    email = input.nextLine();
                    System.out.println("Enter User phone ");
                    System.out.print("=> ");
                    phone = input.nextLine();
                    c[i] = new Client();
                    c[i].set_val_client(name, email, phone);

                }
                max_Client += l;
            }
            if (x == 4) {
                for (int i = 0; i < max_Destination; i++) {
                    System.out.println("Destination id = " + i);
                    d[i].show_destination();
                }

            }
            if (x == 5) {
                for (int i = 0; i < max_Client; i++) {
                    System.out.println("Client id = " + i);
                    c[i].show_client();
                }

            }
            if (x == 2) {
                int l;
                String dName, cName, dNum, cNum, bus_no;
                System.out.println("Enter total bus number  ");
                System.out.print("=> ");
                l = input.nextInt();
                input.nextLine();

                for (int i = max_Bus; i < max_Bus + l; i++) {
                    System.out.println("Enter Bus Number  ");
                    System.out.print("=> ");
                    bus_no = input.nextLine();
                    System.out.println("Enter Driver name  ");
                    System.out.print("=> ");
                    dName = input.nextLine();
                    System.out.println("Enter Conductor name  ");
                    System.out.print("=> ");
                    cName = input.nextLine();
                    System.out.println("Enter Driver's Number  ");
                    System.out.print("=> ");
                    dNum = input.nextLine();
                    System.out.println("Enter Conductor's Number  ");
                    System.out.print("=> ");
                    cNum = input.nextLine();
                    b[i] = new Bus();
                    b[i].set_val_busInfo(bus_no, dName, cName, dNum, cNum);

                }
                max_Bus += l;
            }
            if (x == 6) {
                int choice;

                System.out.println("1. View all Bus info ");
                System.out.println("2. View specific Bus info ");
                System.out.println("0. exit");
                System.out.print("=> ");
                choice = input.nextInt();
                input.nextLine();
                if (choice == 0) {
                    continue;
                }
                if (choice == 1) {
                    for (int i = 0; i < max_Bus; i++) {
                        System.out.println("Vehicle id = " + i);
                        b[i].show_bus_info();
                    }
                }
                if (choice == 2) {
                    int index;
                    System.out.println("Enter Bus index number");
                    System.out.print("=> ");
                    index = input.nextInt();
                    b[index].show_bus_info();
                }

            }

        }

    }

}
