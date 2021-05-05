package controllers;

import models.Oto;
import models.XeMay;
import models.XeTai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XoaPhuongTien {
    static void xoaXeTai(){
        List<XeTai>xeTaiList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeTai.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] split = line.split(",");
                XeTai xeTai = new XeTai(split[0],split[1],split[2],split[3],split[4]);
                xeTaiList.add(xeTai);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Nhập biển số cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String bienSo = scanner.nextLine();
       for(int i=0;i<xeTaiList.size();i++){
           if(xeTaiList.get(i).getBienKiemSoat().equals(bienSo)){
               System.out.println("Bấm Yes để xóa No để quay lại");
               String chon = scanner.nextLine();
               if(chon.equals("Yes")){
                   xeTaiList.remove(xeTaiList.get(i));
               }
               else {
                   DisplayMenu.hienThiMenu();
               }
           }
       }
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeTai.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeTai xeTai:xeTaiList){
                bufferedWriter.write(xeTai.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void xoaOto(){
        List<Oto>otoList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\oto.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] split = line.split(",");
                Oto oto = new Oto(split[0],split[1],split[2],split[3],split[4],split[5]);
                otoList.add(oto);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Nhập biển số cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String bienSo = scanner.nextLine();
        for(int i=0;i<otoList.size();i++){
            System.out.println("Bấm Yes để xóa No để quay lại");
            String chon = scanner.nextLine();
            if(chon.equals("Yes")){
                otoList.remove(otoList.get(i));
            }
            else {
                DisplayMenu.hienThiMenu();
            }
        }
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\oto.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto:otoList){
                bufferedWriter.write(oto.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void xoaXeMay(){
        List<XeMay>xeMayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeMay.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] split = line.split(",");
                XeMay xeMay = new XeMay(split[0],split[1],split[2],split[3],split[4]);
                xeMayList.add(xeMay);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Nhập biển số cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String bienSo = scanner.nextLine();
        for(int i=0;i<xeMayList.size();i++){
            if(xeMayList.get(i).getBienKiemSoat().equals(bienSo)){
                System.out.println("Bấm Yes để xóa No để quay lại");
                String chon = scanner.nextLine();
                if(chon.equals("Yes")){
                    xeMayList.remove(xeMayList.get(i));
                }
                else {
                    DisplayMenu.hienThiMenu();
                }
            }
        }
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeMay.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeMay xeMay:xeMayList){
                bufferedWriter.write(xeMay.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
