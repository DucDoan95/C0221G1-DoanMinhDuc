package controllers;

import commons.RegexValidate;
import models.Oto;
import models.PhuongTien;
import models.XeMay;
import models.XeTai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemPhuongTien {
    static List<PhuongTien>phuongTienList = new ArrayList<>();

    public static void ThemXeTai(){
        Scanner scanner = new Scanner(System.in);
        PhuongTien xeTai = new XeTai();
        System.out.print("Nhập biển kiểm soát: ");
        String bienSo=scanner.nextLine();
        while (!RegexValidate.regexBienSoXeTai(bienSo)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại biển kiểm soát: ");
            bienSo=scanner.nextLine();
        }
        xeTai.setBienKiemSoat(bienSo);

        System.out.print("Nhập tên hãng sản xuất: ");
        String tenHang = scanner.nextLine();
        while (!RegexValidate.regexTenHangSanXuat(tenHang)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại tên hãng sản xuất: ");
            tenHang=scanner.nextLine();
        }
        xeTai.setTenHangSanXuat(tenHang);

        System.out.print("Nhập năm sản xuất: ");
        String nam = scanner.nextLine();
        while (!RegexValidate.regexNamSanXuat(nam)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại năm sản xuất: ");
            nam=scanner.nextLine();
        }
        xeTai.setNamSanXuat(nam);

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        while (!RegexValidate.regexTenHangSanXuat(tenHang)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại tên chủ sở hữu: ");
            chuSoHuu=scanner.nextLine();
        }
        xeTai.setChuSoHuu(chuSoHuu);

        System.out.print("Nhập trọng tải: ");
        String trongTai = scanner.nextLine();
        while (!RegexValidate.regexSo(trongTai)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại trọng tải: ");
            trongTai=scanner.nextLine();
        }
        ((XeTai)xeTai).setTrongTai(trongTai);
        phuongTienList.add(xeTai);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeTai.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien:phuongTienList){
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        phuongTienList.clear();
    }

    public static void themOto(){
        Scanner scanner = new Scanner(System.in);
        PhuongTien oto= new Oto();
        System.out.print("Nhập biển kiểm soát: ");
        String bienSo = scanner.nextLine();
        while (!RegexValidate.regexBienSoOto(bienSo)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại biển kiểm soát: ");
            bienSo = scanner.nextLine();
        }
        oto.setBienKiemSoat(bienSo);

        System.out.print("Nhập tên hãng sản xuất: ");
        String hang = scanner.nextLine();
        while (!RegexValidate.regexTenHangSanXuat(hang)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại tên hãng sản xuất: ");
            hang=scanner.nextLine();
        }
        oto.setTenHangSanXuat(hang);

        System.out.print("Nhập năm sản xuất: ");
        String nam = scanner.nextLine();
        while (!RegexValidate.regexNamSanXuat(nam)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại năm sản xuất: ");
            nam=scanner.nextLine();
        }
        oto.setNamSanXuat(nam);

        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu=scanner.nextLine();
        while (!RegexValidate.regexChuSoHuu(chuSoHuu)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại chủ sở hữu: ");
            chuSoHuu=scanner.nextLine();
        }
        oto.setChuSoHuu(chuSoHuu);

        System.out.print("Nhập số chỗ ngồi: ");
        String choNgoi = scanner.nextLine();
        while (!RegexValidate.regexSo(choNgoi)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại chỗ ngồi: ");
            choNgoi=scanner.nextLine();
        }
        ((Oto)oto).setSoChoNgoi(choNgoi);

        String kieuXe = kieuXe(bienSo);
        ((Oto)oto).setKieuXe(kieuXe);
        phuongTienList.add(oto);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\oto.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien:phuongTienList){
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        phuongTienList.clear();
    }
    static String kieuXe(String num){
        String[] strings = num.split("");
        if(strings[2].equals("A")){
            return "Xe du lịch";
        }else {
            return "Xe khách";
        }
    }

    public static void ThemXeMay(){
        Scanner scanner = new Scanner(System.in);
        PhuongTien xeMay = new XeMay();
        System.out.print("Nhập biển kiểm soát: ");
        String bienSo = scanner.nextLine();
        while (!RegexValidate.regexBienSoXeMay(bienSo)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại biển kiểm soát: ");
            bienSo=scanner.nextLine();
        }
        xeMay.setBienKiemSoat(bienSo);

        System.out.print("Nhập tên hãng sản xuất: ");
        String tenHang = scanner.nextLine();
        while (!RegexValidate.regexTenHangSanXuat(tenHang)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại tên hãng sản xuất: ");
            tenHang=scanner.nextLine();
        }
        xeMay.setTenHangSanXuat(tenHang);

        System.out.println("Nhập năm sản xuất: ");
        String nam = scanner.nextLine();
        while (!RegexValidate.regexNamSanXuat(nam)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại năm sản xuất: ");
            nam=scanner.nextLine();
        }
        xeMay.setNamSanXuat(nam);

        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        while (!RegexValidate.regexChuSoHuu(chuSoHuu)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại chủ sở hữu: ");
            chuSoHuu=scanner.nextLine();
        }
        xeMay.setChuSoHuu(chuSoHuu);

        System.out.println("Nhập công suất: ");
        String congSuat = scanner.nextLine();
        while (!RegexValidate.regexSo(congSuat)){
            System.out.println("Sai định dạng !!!");
            System.out.print("Nhập lại công suất: ");
            congSuat=scanner.nextLine();
        }
        ((XeMay)xeMay).setCongSuat(congSuat);
        phuongTienList.add(xeMay);
        try{
            FileWriter fileWriter = new FileWriter("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Quan Ly Phuong Tien Giao Thong\\src\\data\\xeMay.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien:phuongTienList){
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.append("\n");
            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        phuongTienList.clear();
    }


}
