package controllers;

import commons.ReadWriteFile;
import commons.RegexServices;
import models.Room;
import models.Services;
import models.Villa;

import java.util.*;

public class RoomController {
    public static void addRoom(){
        List<Services> servicesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Service Room");
        String idService = scanner.nextLine();
        while (!RegexServices.isValidIDVRoom(idService)){
            System.err.println("ID Service must be this format (SVRO-YYYY \"Y is number 0-9\")");
            System.out.println("Enter ID Service Room");
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

        System.out.println("Enter Free Service ");
        String freeService = scanner.nextLine();
        while (!RegexServices.isValidExtraService(freeService)){
            System.err.println("Accompanying services must be of value: massage, karaoke, food, drink, car");
            System.out.println("Enter Free Service ");
            freeService = scanner.nextLine();
        }

        Room room = new Room(idService,nameService,areUsing,rentalFee,maximumPeople,rentalType,freeService);
        servicesList.add(room);
        ReadWriteFile.WriteFile("Room.csv",servicesList,true);
    }

    public static void showRoom(){
        List<Services> servicesList = new ArrayList<>();
        servicesList = ReadWriteFile.ReadFile("Room.csv");
        for (Services services : servicesList) {
            if (services instanceof Room) {
                System.out.println(services.showInfo());
            }
        }
    }

    public static void showAllNameRoom(){
        TreeSet<String> servicesTreeSet = new TreeSet<>(new HashSet<>());
        List<Services> servicesList = new ArrayList<>();
        servicesList = ReadWriteFile.ReadFile("Room.csv");
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
