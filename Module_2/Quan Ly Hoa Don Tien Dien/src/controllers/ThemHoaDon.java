package controllers;

import models.HoaDon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemHoaDon {
    static List<HoaDon> hoaDonList = new ArrayList<>();
    static String idKhachHang = "";
    static String dinhMuc="";
    public static void themHoaDon(){
        HoaDon hoaDon = new HoaDon();
        Scanner scanner = new Scanner(System.in);
        HienThiKhachHang.hienThiKhachHang();
        System.out.print("Nhập ID Khách Hàng: ");
        timKiemIDKH();
        hoaDon.setMaKhachHang(idKhachHang);
        System.out.println("Nhap mã hóa đơn: ");
        hoaDon.setMaHoaDon(scanner.nextLine());
        System.out.println("Ngày ra hóa đơn: ");
        hoaDon.setNgayRaHoaDon(scanner.nextLine());
        System.out.println("Số KW tiêu thụ: ");
        String soKW = scanner.nextLine();
        hoaDon.setSoLuong(Float.parseFloat(soKW));
        System.out.println("Đơn giá: ");
        String donGia = scanner.nextLine();
        hoaDon.setDonGia(Float.parseFloat(donGia));
        double thanhTien =0;
        int vuotMuc= Integer.parseInt(dinhMuc)-Integer.parseInt(soKW);
        //hoaDon.setDonGia(Float.parseFloat(scanner.nextLine()));
        if(Integer.parseInt(soKW)<=Integer.parseInt(dinhMuc)){
            thanhTien = Integer.parseInt(soKW)*Float.parseFloat(donGia);
        }else {
            thanhTien = Integer.parseInt(soKW)*Float.parseFloat(donGia)*Integer.parseInt(dinhMuc)+vuotMuc*Float.parseFloat(donGia)*2.5;
        }
        hoaDon.setThanhTien(thanhTien);
        hoaDonList.add(hoaDon);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\hoaDon.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (HoaDon hoaDon1:hoaDonList){
                bufferedWriter.write(hoaDon1.toString()+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        hoaDonList.clear();
    }
    public static void timKiemIDKH(){
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        boolean check =false;
        try {
            FileReader fileReader = new FileReader("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Hoa Don Tien Dien\\src\\data\\khachHang.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line=bufferedReader.readLine())!=null){
                String[] stringID = line.split(",");
                if(stringID[0].equals(id)){
                    System.out.println(line);
                    idKhachHang+=stringID[0];
                    dinhMuc+=stringID[3];
                    System.out.println(dinhMuc);
                    check=true;
                }
            }
            if(check==false){
                System.out.println("Không có khách hàng nào trùng ID trên");
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
