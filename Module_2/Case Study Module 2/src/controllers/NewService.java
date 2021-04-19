package controllers;

import models.Services;

import java.util.Scanner;

public class NewService {
    void addNewService(Services services){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        services.setId(scanner.nextLine());
        System.out.print("Enter Service Name: ");
        services.setServiceName(scanner.nextLine());
        System.out.print("Enter Area Using: ");
        services.setAreaUsing(Float.parseFloat(scanner.nextLine()));
        System.out.print("Enter Rental Fee: ");
        services.setRentalFee(Double.parseDouble(scanner.nextLine()));
        System.out.print("Enter Maximum number of people: ");
        services.setMaxPeople(Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter Rental Type: ");
        services.setTypeRental(scanner.nextLine());
    }
}
