package controllers;

import models.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerController {
    private static NewCustomer newCustomer = new NewCustomer();
    static List<Customer> listCustomer = new ArrayList<>();
    public static void addNewCustomer(){
        Customer customers = newCustomer.addNewCustomer();
        listCustomer.add(customers);
    }
    public static void showInfoOfCustomer(){
        listCustomer.sort(Comparator.comparing(Customer::getName));
        for(Customer customer:listCustomer){
            System.out.println(customer.showInfor());
        }
    }
}
