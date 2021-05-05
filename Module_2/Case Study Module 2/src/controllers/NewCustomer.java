package controllers;

import commons.RegexCustomer;
import models.Customer;

import java.util.Scanner;

public class NewCustomer {

    public static Customer addNewCustomer() {
        Customer customers = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String name = scanner.nextLine();
        while (!RegexCustomer.regexNameCustomer(name)) {
            System.err.println("Customer's name must capitalize the first letter of each word");
            System.out.println("Enter Customer Name: ");
            name = scanner.nextLine();
        }
        customers.setName(name);

        System.out.print("Enter Customer Birthday : ");
        String birthday = scanner.nextLine();
        while (!RegexCustomer.regexBirthdayCustomer(birthday)) {
            System.out.println("Birthday must  be in the format dd/mm/yyyy and year >1900");
            System.out.print("Enter Customer Birthday: ");
            birthday = scanner.nextLine();
        }
        customers.setBirthday(birthday);

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
        while (!RegexCustomer.regexIDCustomer(idCard)) {
            System.out.println("The Id Card must have 9 digits and be in the format XXX XXX XXX");
            System.out.print("Enter Customer ID: ");
            idCard = scanner.nextLine();
        }
        customers.setIdCard(idCard);

        System.out.print("Enter Customer Phone Number: ");
        customers.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Customer Email : ");
        String email = scanner.nextLine();
        while (!RegexCustomer.regexEmailCustomer(email)) {
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
