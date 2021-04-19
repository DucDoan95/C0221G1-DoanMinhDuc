package controllers;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();


    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("      MAIN MENU:\n" +
                    "1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    CustomerController.addNewCustomer();
                    break;
                case "4":
                    CustomerController.showInfoOfCustomer();
                    break;
                case "5":
                    // Add New Booking
                    break;
                case "6":
                    // Show Information of Employee
                    break;
                case "7":
                    System.exit(0);
                    break;
            }
        }

    }

    public static void addNewServices() {
        while (true) {
            System.out.println("\n      ADD NEW SERVICE:\n" +
                    "1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    ServiceController.addVillaService();
                    break;
                case "2":
                    ServiceController.addHouseService();
                    break;
                case "3":
                    ServiceController.addRoomService();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }

    }

    public static void showServices() {
        while (true) {
            System.out.println("\n      SHOW SERVICES:\n" +
                    "1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    ServiceController.showAllVillaService();
                    break;
                case "2":
                    System.out.println("\n");
                    ServiceController.showAllHouseService();
                    break;
                case "3":
                    System.out.println("\n");
                    ServiceController.showAllRoomService();
                    break;
                case "4":
                    System.out.println("\n      ALL VILLA NAME WE HAVE");
                    ServiceController.showAllNameVilla();
                    break;
                case "5":
                    System.out.println("\n      ALL HOUSE NAME WE HAVE");
                    ServiceController.showAllNameHouse();
                    break;
                case "6":
                    System.out.println("\n      ALL ROOM NAME WE HAVE");
                    ServiceController.showAllNameRoom();
                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    System.exit(0);
                    break;
            }
        }

    }
}
