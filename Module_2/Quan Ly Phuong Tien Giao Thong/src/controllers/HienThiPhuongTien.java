package controllers;

import java.io.BufferedReader;
import java.io.FileReader;

public class HienThiPhuongTien {
    public static void hienThiXeTai(){
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeTai.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void hienThiXeOto(){
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\oto.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void hienThiXeMay(){
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeMay.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
