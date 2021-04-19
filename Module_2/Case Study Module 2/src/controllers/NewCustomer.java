package controllers;

import models.Customer;

import java.util.Scanner;

public class NewCustomer {
    static final String regexName = "^[A-Z][a-z]{0,}(?: [A-Z][a-z]*){0,}$";
    static final String regexID = "^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$";
    static final String regexEmail = "^[A-Za-z0-9_]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z0-9]{1,}$";
    static final String regexBirthday = "^([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])[\\/]([0][1-9]|[1][0-2])[\\/]([1][9][0][1-9]|[1][9][1-9][0-9]|[2-9][0-9][0-9][0-9])$";

    public static Customer addNewCustomer() {
        Customer customers = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        while (!name.matches(regexName)) {
            System.out.println("Customer's name must capitalize the first letter of each word");
            System.out.print("Enter Customer Name: ");
            name = scanner.nextLine();
        }
        customers.setName(name);

        System.out.print("Enter Customer Birthday : ");
        String birthday = scanner.nextLine();
        while (!birthday.matches(regexBirthday)) {
            System.out.println("Birthday must  be in the format dd/mm/yyyy and year >1900");
            System.out.print("Enter Customer Birthday: ");
            birthday = scanner.nextLine();
        }

        System.out.print("Enter Customer Gender: ");
        String gender = scanner.nextLine();
        while (true){
            if (gender.toUpperCase().equals("MALE")  || gender.toUpperCase().equals("FEMALE")  || gender.toUpperCase().equals("UNKNOW") ) {
                customers.setGender(gender);
                break;
            } else {
                System.out.println("Gender must be 'Male' 'Female' or 'Unknow'");
                System.out.print("Enter Customer Gender: ");
                gender = scanner.nextLine();
            }
        }



        System.out.print("Enter Customer ID Card : ");
        String idCard = scanner.nextLine();
        while (!idCard.matches(regexID)) {
            System.out.println("The Id Card must have 9 digits and be in the format XXX XXX XXX");
            System.out.print("Enter Customer ID: ");
            idCard = scanner.nextLine();
        }
        customers.setIdCard(idCard);

        System.out.print("Enter Customer Phone Number: ");
        customers.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Customer Email : ");
        String email = scanner.nextLine();
        while (!email.matches(regexEmail)) {
            System.out.println("Email must be in the correct format abc@abc.abc");
            System.out.print("Enter Customer Email: ");
            email = scanner.nextLine();
        }
        customers.setEmail(email);

        System.out.print("Enter Type of Customer : ");
        customers.setCustomerType(scanner.nextLine());
        System.out.print("Enter Customer Address: ");
        customers.setAddress(scanner.nextLine());
        return customers;
    }
}
