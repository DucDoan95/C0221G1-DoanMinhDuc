package controllers;

import commons.ReadWriteFile;
import models.Customer;
import models.Services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController {
    static Scanner scanner = new Scanner(System.in);
    static String temp = "";

    public static void addNewBooking() {
        chooseCustomer();
        chooseService();
        System.out.println(temp);
        File file = new File("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Furama\\src\\data\\Booking.csv");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(temp);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        temp = "";
    }

    public static void chooseCustomer() {
        List<Customer> customerList = new ArrayList<>();
        customerList = ReadWriteFile.ReadFileCustomer("Customer.csv");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("STT " + (i + 1) + " " + customerList.get(i).showInfo());
        }
        int chooseCustomer;
        while (true) {
            System.out.println("Enter STT Customer");
            chooseCustomer = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (i == chooseCustomer - 1) {
                    temp += customerList.get(chooseCustomer - 1).showInfo();
                    return;
                }
            }
            System.err.println("STT Wrong or dont have STT in the System");

        }
    }

    public static void chooseService() {
        while (true) {
            System.out.println(
                    "1. Booking Villa\n" +
                            "2. Booking House\n" +
                            "3. Booking Room\n");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                List<Services> servicesList = new ArrayList<>();
                servicesList = ReadWriteFile.ReadFile("Villa.csv");
                VillaController.showVilla();

                while (true) {
                    System.out.println("Enter ID Villa to Booking");
                    String idVilla = scanner.nextLine();
                    for (int i = 0; i < servicesList.size(); i++) {
                        if (servicesList.get(i).getId().equals(idVilla)) {
                            temp += " IS BOOKING ";
                            temp += servicesList.get(i).showInfo();
                            return;
                        }
                    }
                    System.err.println("ID Wrong or dont have ID in the System");
                }
            } else if (choose == 2) {
                List<Services> servicesList = new ArrayList<>();
                servicesList = ReadWriteFile.ReadFile("House.csv");
                HouseController.showHouse();
                while (true) {
                    System.out.println("Enter ID House to Booking");
                    String idHouse = scanner.nextLine();
                    for (int i = 0; i < servicesList.size(); i++) {
                        if (servicesList.get(i).getId().equals(idHouse)) {
                            temp += " IS BOOKING ";
                            temp += servicesList.get(i).showInfo();
                            return;
                        }
                    }
                    System.err.println("ID Wrong or dont have ID in the System");

                }
            } else if (choose == 3) {
                List<Services> servicesList = new ArrayList<>();
                servicesList = ReadWriteFile.ReadFile("Room.csv");
                RoomController.showRoom();
                while (true) {
                    System.out.println("Enter ID Room to Booking");
                    String idRoom = scanner.nextLine();
                    for (int i = 0; i < servicesList.size(); i++) {
                        if (servicesList.get(i).getId().equals(idRoom)) {
                            temp += " IS BOOKING ";
                            temp += servicesList.get(i).showInfo();
                            return;
                        }
                    }
                    System.err.println("ID Wrong or dont have ID in the System");

                }
            }
        }
    }
}

