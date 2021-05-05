package controllers;

import models.Customer;
import models.Employee;
import models.Villa;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        while (true) {
            System.out.println("      MAIN MENU:\n" +
                    "1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit\n"+
                    "8. Cinema\n");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    menuAddNewServices();
                    break;
                case "2":
                    menuShowServices();
                    break;
                case "3":
                    CustomerController.addCustomer();
                    break;
                case "4":
                    CustomerController.showCustomer();
                    break;
                case "5":
                    BookingController.addNewBooking();
                    break;
                case "6":
                    EmployeeController.showEmployee();
                    break;
                case "7":
                    System.exit(0);
                    break;
                case "8":
                    FuramaCinema.buyTicket();
            }
        }
    }

    public static void menuAddNewServices() {
        while (true) {
            System.out.println("      ADD NEW SERVICE:\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    VillaController.addVilla();
                    break;
                case "2":
                    HouseController.addHouse();
                    break;
                case "3":
                    RoomController.addRoom();
                    break;
                case "4":
                    Menu.mainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }

    }

    public static void menuShowServices(){
        while (true) {
            System.out.println("      SHOW SERVICES:\n" +
                    "1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Room Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit\n");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    VillaController.showVilla();
                    break;
                case "2":
                    HouseController.showHouse();
                    break;
                case "3":
                    RoomController.showRoom();
                    break;
                case "4":
                    VillaController.showAllNameVilla();
                    break;
                case "5":
                    HouseController.showAllNameHouse();
                    break;
                case "6":
                    RoomController.showAllNameRoom();
                    break;
                case "7":
                    Menu.mainMenu();
                    break;
                case "8":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menuBooking(String choose){
        while (true) {
            System.out.println("      BOOKING SERVICE:\n" +
                    "1. Booking Villa\n" +
                    "2. Booking House" +
                    "3. Booking Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit");
          //  Scanner scanner = new Scanner(System.in);
            switch (choose) {
                case "1":
                    VillaController.showVilla();
                    break;
                case "2":
                    HouseController.showHouse();
                    break;
                case "3":
                    RoomController.showRoom();
                    break;
                case "4":
                    Menu.mainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }
    }
}
