package controllers;

import commons.ReadWriteFile;
import models.Customer;

import java.util.*;

public class FuramaCinema {
    static Queue<String>queue=new LinkedList<>();
    public static void buyTicket(){
        Scanner scanner = new Scanner(System.in);

        List<Customer> customerList = new ArrayList<>();
        customerList=ReadWriteFile.ReadFileCustomer("Customer.csv");
        for(int i=0;i<customerList.size();i++){
            System.out.println("STT "+(i+1)+" "+customerList.get(i).showInfo());
        }
        while (true) {
            System.out.println("Choose STT Customer to buy ticket");
            int stt = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (i == stt - 1) {
                    queue.offer(customerList.get(stt - 1).getCustomerName());
                    System.out.println(queue);
                    return;
                }
            }

        }

    }

}
