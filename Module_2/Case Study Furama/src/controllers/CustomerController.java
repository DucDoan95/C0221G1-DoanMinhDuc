package controllers;

import commons.CustomerException;
import commons.ReadWriteFile;
import models.Customer;
import models.Room;
import models.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void addCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name = null;
        while (true) {
            try {
                System.out.println("Enter Customer Name");
                name = scanner.nextLine();
                CustomerException.nameException(name);
                break;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }

        String birthday = null;
        int year = 0;
        while (true) {
            try {
                System.out.println("Enter Customer Birthday");
                birthday = scanner.nextLine();
                CustomerException.birthdayException(birthday);
                year=2021-Integer.parseInt(birthday.substring(6));
                while (true){
                    if(year<18){
                        System.err.println("Less than the current year 18 years");
                        System.out.println("Enter Customer Birthday");
                        birthday = scanner.nextLine();
                        CustomerException.birthdayException(birthday);
                        year=2021-Integer.parseInt(birthday.substring(6));
                    }else {
                        break;
                    }
                }
                break;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }

        String gender = null;
        while (true) {
            try {
                System.out.println("Enter Customer Gender");
                gender = scanner.nextLine();
                CustomerException.genderException(gender);
                gender = gender.toLowerCase();
                if(gender.equals("male")){
                    gender = "Male";
                }else if(gender.equals("female")){
                    gender = "Female";
                }else {
                    gender ="Unknow";
                }
                break;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }

        String idCard = null;
        while (true) {
            try {
                System.out.println("Enter Customer ID Card");
                idCard = scanner.nextLine();
                CustomerException.idCardException(idCard);
                break;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("Enter Customer Phone Number");
        String phoneNumber = scanner.nextLine();

        String email = null;
        while(true) {
            try {
                System.out.println("Enter Customer Email");
                email = scanner.nextLine();
                CustomerException.emailException(email);
                break;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("Enter Customer Type");
        String type = scanner.nextLine();

        System.out.println("Enter Customer Address");
        String address = scanner.nextLine();

        Customer customer = new Customer(name,birthday,gender,idCard,phoneNumber,email,type,address);
        customerList.add(customer);
        ReadWriteFile.WriteFileCustomer("Customer.csv",customerList,true);
    }

    public static void showCustomer(){
        List<Customer> customerList = new ArrayList<>();
        customerList = ReadWriteFile.ReadFileCustomer("Customer.csv");
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }

}
