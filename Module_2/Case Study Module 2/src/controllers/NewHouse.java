package controllers;

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
        ((House) houseService).setRoomStandard(scanner.nextLine());
        System.out.print("Enter Description of the Facility: ");
        ((House) houseService).setDescriptionFacility(scanner.nextLine());
        System.out.print("Enter Number of the Floor: ");
        ((House) houseService).setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
        return houseService;
    }
}
