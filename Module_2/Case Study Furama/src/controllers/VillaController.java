package controllers;

import commons.ReadWriteFile;
import commons.RegexServices;
import models.Services;
import models.Villa;

import java.security.Provider;
import java.util.*;

public class VillaController {
    public static void addVilla(){
        List<Services> servicesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Service House");
        String idService = scanner.nextLine();
        while (!RegexServices.isValidIDVilla(idService)){
            System.err.println("ID Service must be this format (SVVL-YYYY \"Y is number 0-9\")");
            System.out.println("Enter ID Service Villa");
            idService = scanner.nextLine();
        }

        System.out.println("Enter Service Name ");
        String nameService = scanner.nextLine();
        while (!RegexServices.isValidServiceName(nameService)){
            System.err.println("Service name must be capitalized first character, the following characters are normal characters");
            System.out.println("Enter Service Name ");
            nameService = scanner.nextLine();
        }

        System.out.println("Enter Area Using ");
        String areUsing = scanner.nextLine();
        while (!RegexServices.isValidArea(areUsing)){
            System.err.println("Usable area and swimming pool area must be real number greater than 30m2");
            System.out.println("Enter Area Using");
            areUsing = scanner.nextLine();
        }

        System.out.println("Enter Rental Fee ");
        String rentalFee = scanner.nextLine();
        while (!RegexServices.isValidRentalFee(rentalFee)){
            System.err.println("The rental cost must be a positive number");
            System.out.println("Enter Rental Fee ");
            rentalFee = scanner.nextLine();
        }

        System.out.println("Enter Maximum number of People ");
        String maximumPeople = scanner.nextLine();
        while (!RegexServices.isValidNumberPeople(maximumPeople)){
            System.err.println("The maximum number of people must be> 0 and less than <20");
            System.out.println("Enter Maximum number of People ");
            maximumPeople = scanner.nextLine();
        }

        System.out.println("Enter Rental Type ");
        String rentalType = scanner.nextLine();
        while (!RegexServices.isValidServiceName(rentalType)){
            System.err.println("Rental Type must be capitalized first character, the following characters are normal characters");
            System.out.println("Enter Rental Type ");
            rentalType = scanner.nextLine();
        }

        System.out.println("Enter Standard Room ");
        String standardRoom = scanner.nextLine();
        while (!RegexServices.isValidServiceName(standardRoom)){
            System.err.println("Standard Room must be capitalized first character, the following characters are normal characters");
            System.out.println("Enter Standard Room ");
            standardRoom = scanner.nextLine();
        }

        System.out.println("Enter Description Facility ");
        String descriptionFacility = scanner.nextLine();

        System.out.println("Enter area Swimming Pool");
        String areaSwimmingPool = scanner.nextLine();
        while (!RegexServices.isValidArea(areaSwimmingPool)){
            System.err.println("Usable area and swimming pool area must be real number greater than 30m2");
            System.out.println("Enter area Swimming Pool");
            areaSwimmingPool = scanner.nextLine();
        }

        System.out.println("Enter Number of Floor ");
        String numberFloor = scanner.nextLine();
        while (!RegexServices.isValidNumberFloor(idService)){
            System.err.println("Number of Floor must be a positive number");
            System.out.println("Enter Number of Floor ");
            rentalFee = scanner.nextLine();
        }


        Villa villa = new Villa(idService,nameService,areUsing,rentalFee,maximumPeople,rentalType,standardRoom,descriptionFacility,areaSwimmingPool,numberFloor);
        servicesList.add(villa);
        ReadWriteFile.WriteFile("Villa.csv",servicesList,true);
    }

    public static void showVilla(){
        List<Services> servicesList = new ArrayList<>();
        servicesList = ReadWriteFile.ReadFile("Villa.csv");
        for (Services services : servicesList) {
            if (services instanceof Villa) {
                System.out.println(services.showInfo());
            }
        }
    }

    public static void showAllNameVilla(){
        TreeSet<String> servicesTreeSet = new TreeSet<>(new HashSet<>());
        List<Services> servicesList = new ArrayList<>();
        servicesList = ReadWriteFile.ReadFile("Villa.csv");
        String name = null;
        for(int i=0;i<servicesList.size();i++){
            name = servicesList.get(i).getServiceName();
            if(servicesTreeSet.equals(name)){
                continue;
            }
            servicesTreeSet.add(name);
        }
        System.out.println(servicesTreeSet);
    }
}
