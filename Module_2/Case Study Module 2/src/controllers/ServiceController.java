package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.*;
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

        Villa villas = (Villa) newVilla.newService();
        villaList.add(villas);
        try{
            FileWriter fileWriterVilla = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv",true);
            BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);
            for (Villa villa:villaList){
                bufferedWriterVilla.write(villa.toString());
                bufferedWriterVilla.append("\n");
            }
            bufferedWriterVilla.close();
            System.out.println("finish");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addHouseService() {

        House houses = (House) newHouse.newService();
        houseList.add(houses);
        try{
            FileWriter fileWriterHouse = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv",true);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            for (House house:houseList){
                bufferedWriterHouse.write(house.toString());
                bufferedWriterHouse.append("\n");
            }
            bufferedWriterHouse.close();
            System.out.println("finish");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addRoomService() {

        Room rooms = (Room) newRoom.newService();
        roomList.add(rooms);
        try{
            FileWriter fileWriterRoom = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv",true);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            for (Room room:roomList){
                bufferedWriterRoom.write(room.toString());
                bufferedWriterRoom.append("\n");
            }
            bufferedWriterRoom.close();
            System.out.println("finish");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void showAllVillaService() {
//        for (Villa villa : villaList) {
//            System.out.println(villa.showInfor());
//        }
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split.length==10){
                    System.out.println(line);
                }

            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllHouseService() {
      //  List<House> houseList = new ArrayList<>();
//        for (House house : houseList) {
//            System.out.println(house.showInfor()+"\n");
//        }
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split.length==9){
                    System.out.println(line);
                }

            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllRoomService() {
       // List<Room> roomList = new ArrayList<>();
//        for (Room room : roomList) {
//            System.out.println(room.showInfor()+"\n");
//       }
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Module 2\\src\\data\\Service.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split.length==7){
                    System.out.println(line);
                }

            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
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
