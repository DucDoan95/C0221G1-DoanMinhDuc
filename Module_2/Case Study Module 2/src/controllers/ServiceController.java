package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ServiceController {
    private static ServiceInterface newVilla = new NewVilla();
    private static ServiceInterface newHouse = new NewHouse();
    private static ServiceInterface newRoom = new NewRoom();
     static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    public static void addVillaService() {

        Villa villa = (Villa) newVilla.newService();
        villaList.add(villa);
    }

    public static void addHouseService() {

        House house = (House) newHouse.newService();
        houseList.add(house);
    }

    public static void addRoomService() {

        Room room = (Room) newRoom.newService();
        roomList.add(room);
    }

    public static void showAllVillaService() {
      //  List<Villa> villaList = new ArrayList<>();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
    }

    public static void showAllHouseService() {
      //  List<House> houseList = new ArrayList<>();
        for (House house : houseList) {
            System.out.println(house.showInfor()+"\n");
        }
    }

    public static void showAllRoomService() {
       // List<Room> roomList = new ArrayList<>();
        for (Room room : roomList) {
            System.out.println(room.showInfor()+"\n");
        }
    }
    public static void showAllNameVilla(){
        int count =1;
        for (Villa villa:villaList){
            System.out.println((count++)+". " +villa.getServiceName()+"\n");
        }
    }
    public static void showAllNameHouse(){
        int count=1;
        for (House house:houseList){
            System.out.println((count++)+". " +house.getServiceName());
        }
    }
    public static void showAllNameRoom(){
        int count =1;
        for (Room room:roomList){
            System.out.println((count++)+". " +room.getServiceName());
        }
    }



}
