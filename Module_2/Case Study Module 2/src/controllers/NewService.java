package controllers;

import commons.RegexService;
import models.Services;

import java.util.Scanner;

public class NewService {
    void addNewService(Services services){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        services.setId(scanner.nextLine());

        System.out.print("Enter Service Name: ");
        String serviceName =scanner.nextLine();
        while (!RegexService.regexServiceName(serviceName)){
            System.out.println("Service Name must capitalize the first letter of each word");
            System.out.print("Enter Service Name: ");
            serviceName = scanner.nextLine();
        }
        services.setServiceName(serviceName);

        System.out.print("Enter Area Using: ");
        String area = scanner.nextLine();
        services.setAreaUsing(Float.parseFloat(area));

        System.out.print("Enter Rental Fee: ");
        String rentalFee =scanner.nextLine();
        while (!RegexService.regexRentalFee(rentalFee)){
            System.out.println("Rental Fee must be a positive integer");
            System.out.print("Enter Rental Fee: ");
            rentalFee = scanner.nextLine();
        }
        services.setRentalFee(Double.parseDouble(rentalFee));

        System.out.print("Enter Maximum number of people: ");
        String maxPeople =scanner.nextLine();
        while (!RegexService.regexMaxPeople(maxPeople)){
            System.out.println("Maximum people must be >0 and <20 people");
            System.out.print("Enter Maximum number of people: ");
            maxPeople = scanner.nextLine();
        }
        services.setMaxPeople(Integer.parseInt(maxPeople));

        System.out.print("Enter Rental Type: ");
        String rentalType =scanner.nextLine();
        while (!RegexService.rexRentalType(rentalType)){
            System.out.println("Rental Type must capitalize the first letter of each word");
            System.out.print("Enter Rental Type: ");
            rentalType = scanner.nextLine();
        }
        services.setTypeRental(rentalType);
    }
}
