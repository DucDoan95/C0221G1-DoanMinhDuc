package controllers;

import models.House;
import models.Room;
import models.Services;

import java.security.Provider;
import java.util.Scanner;

public class NewRoom extends NewService implements ServiceInterface {


    @Override
    public Services newService() {
        Scanner scanner = new Scanner(System.in);
        Services roomService = new Room();
        super.addNewService(roomService);
        System.out.print("Enter Service Free: ");
        ((Room) roomService).setServiceFree(scanner.nextLine());
        return roomService;
    }
}
