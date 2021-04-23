package controllers;

import models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerController {
    private static NewCustomer newCustomer = new NewCustomer();
    static List<Customer> listCustomer = new ArrayList<>();
    public static void addNewCustomer() throws IOException {
        Customer customers = newCustomer.addNewCustomer();
        listCustomer.add(customers);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Customer.csv",true);
            BufferedWriter bufferedWriterCustomer = new BufferedWriter(fileWriter);
            for (Customer customer:listCustomer){
                bufferedWriterCustomer.write(customer.toString());
                bufferedWriterCustomer.append("\n");
            }
            bufferedWriterCustomer.close();
            System.out.println("finish");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void showInfoOfCustomer(){
        try{
            File file = new File("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Customer.csv");
            FileReader fileReaderCustomer = new FileReader(file);
            BufferedReader bufferedReaderCustomer = new BufferedReader(fileReaderCustomer);
            String line = null;
            while ((line = bufferedReaderCustomer.readLine())!=null){
                System.out.println(line);
            }
            bufferedReaderCustomer.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
