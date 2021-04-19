package controllers;

import models.Services;
import models.Villa;

import java.security.Provider;
import java.util.Scanner;

public class NewVilla extends NewService implements ServiceInterface {
    @Override
    public Services newService() {
        Scanner scanner = new Scanner(System.in);
        Services villaService = new Villa();
        super.addNewService(villaService);
        System.out.print("Enter Standard of Room: ");
        ((Villa) villaService).setRoomStandard(scanner.nextLine());
        System.out.print("Enter Description of the Facility: ");
        ((Villa) villaService).setDescriptionFacility(scanner.nextLine());
        System.out.print("Enter Area of Swimming Pool: ");
        ((Villa) villaService).setAreaSwimmingPool(Float.parseFloat(scanner.nextLine()));
        System.out.print("Enter Number of the Floor: ");
        ((Villa) villaService).setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
        return villaService;
    }
}
