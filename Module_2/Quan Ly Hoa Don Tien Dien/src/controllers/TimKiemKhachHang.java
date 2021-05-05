package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TimKiemKhachHang {
    public static void timKiemKH(){
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();
        boolean check =false;
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\khachHang.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line=bufferedReader.readLine())!=null){
                String[] stringTen = line.split(",");
                if(stringTen[1].contains(ten)){
                    System.out.println(line);
                    check=true;
                }
            }
            if(check==false){
                System.out.println("Không có khách hàng nào được tìm thấy");
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
