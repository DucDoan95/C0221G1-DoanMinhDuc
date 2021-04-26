package controllers;

import commons.RegexService;
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
        String standardRoom = scanner.nextLine();
        while (!RegexService.regexRoomStandard(standardRoom)){
            System.out.println("Standard of Room must capitalize the first letter of each word");
            System.out.print("Enter Standard of Room: ");
            standardRoom = scanner.nextLine();
        }
        ((Villa) villaService).setRoomStandard(standardRoom);

        System.out.print("Enter Description of the Facility: ");
        ((Villa) villaService).setDescriptionFacility(scanner.nextLine());

        System.out.print("Enter Area of Swimming Pool: ");
        String areaSwimmingPool =(scanner.nextLine());
        ((Villa) villaService).setAreaSwimmingPool(Float.parseFloat(areaSwimmingPool));

        System.out.print("Enter Number of the Floor: ");
        String numberOfFloor=scanner.nextLine();
        while (!RegexService.regexNumberOfFloor(numberOfFloor)){
            System.out.println("Number of Floor must be a positive integer");
            System.out.print("Enter Number of Floor: ");
            numberOfFloor = scanner.nextLine();
        }
        ((Villa) villaService).setNumberOfFloor(Integer.parseInt(numberOfFloor));
        return villaService;
    }
}
