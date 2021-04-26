package controllers;

import commons.RegexService;
import models.House;
import models.Services;
import models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Provider;
import java.util.Scanner;

public class NewHouse extends NewService implements ServiceInterface {


    @Override
    public Services newService() {
        Scanner scanner = new Scanner(System.in);
        Services houseService = new House();
        super.addNewService(houseService);
        System.out.print("Enter Standard of Room: ");
        String standardOfRoom = scanner.nextLine();
        while (!RegexService.regexRoomStandard(standardOfRoom)){
            System.out.println("Standard of Room must capitalize the first letter of each word");
            System.out.print("Enter Standard of Room: ");
            standardOfRoom = scanner.nextLine();
        }
        ((House) houseService).setRoomStandard(scanner.nextLine());

        System.out.print("Enter Description of the Facility: ");
        ((House) houseService).setDescriptionFacility(scanner.nextLine());

        System.out.print("Enter Number of the Floor: ");
        String numberOfFloor = scanner.nextLine();
        while (!RegexService.regexNumberOfFloor(numberOfFloor)){
            System.out.println("Number of Floor must be a positive integer");
            System.out.print("Enter Number of Floor: ");
            numberOfFloor = scanner.nextLine();
        }
        ((House) houseService).setNumberOfFloor(Integer.parseInt(numberOfFloor));
        return houseService;
    }
}
