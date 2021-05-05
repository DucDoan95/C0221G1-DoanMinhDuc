package controllers;

import models.KhachHang;
import models.KhachHangNN;
import models.KhachHangVN;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemKhachHang {
    static List<KhachHang> khachHangList = new ArrayList<>();
    public static void themKhachHangVN(){
        KhachHangVN khachHangVN = new KhachHangVN();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        khachHangVN.setMaKH(scanner.nextLine());
        System.out.println("Nhập họ tên khách hàng: ");
        khachHangVN.setTenKH(scanner.nextLine());
        System.out.println("Nhập loại khách hàng: ");
        khachHangVN.setLoaiKH(scanner.nextLine());
        System.out.println("Nhập định mức tiêu thụ: ");
        khachHangVN.setDinhMucTieuThu(scanner.nextLine());
        khachHangList.add(khachHangVN);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\khachHang.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (KhachHang khachHang:khachHangList){
                bufferedWriter.write(khachHang.toString()+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        khachHangList.clear();
    }
    public static void themKhachHangNN(){
        KhachHangNN khachHangNN = new KhachHangNN();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        khachHangNN.setMaKH(scanner.nextLine());
        System.out.println("Nhập họ tên khách hàng: ");
        khachHangNN.setTenKH(scanner.nextLine());
        System.out.println("Nhập quốc tịch");
        khachHangNN.setQuocTich(scanner.nextLine());
        khachHangList.add(khachHangNN);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\khachHang.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(KhachHang khachHang:khachHangList){
                bufferedWriter.write(khachHang.toString()+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        khachHangList.clear();
    }
    
}
