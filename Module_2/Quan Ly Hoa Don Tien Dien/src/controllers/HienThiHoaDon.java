package controllers;

import java.io.BufferedReader;
import java.io.FileReader;

public class HienThiHoaDon {
    public static void hienThiHoaDon(){
        try{
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\hoaDon.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
