package controllers;

import commons.DocGhiFile;
import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThemCanBo {
    static Scanner scanner = new Scanner(System.in);
    static List<CanBo> canBoList = new ArrayList<>();
    public static void themCongNhan(){
        System.out.println("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh (dd/mm/yyyy)");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính (Nam hoặc Nữ)");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc (Bậc 3/4, Bậc 4/7, Bậc ... ");
        String bac = scanner.nextLine();
        canBoList.add(new CongNhan(hoTen,namSinh,gioiTinh,diaChi,bac));
        DocGhiFile.ghiFile("canbo.csv",canBoList,false);
    }
    public static void themKySu(){
        System.out.println("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh (dd/mm/yyyy)");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính (Nam hoặc Nữ)");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngành đào tạo:  ");
        String nganhDaoTao = scanner.nextLine();
        canBoList.add(new KySu(hoTen,namSinh,gioiTinh,diaChi,nganhDaoTao));
        DocGhiFile.ghiFile("canbo.csv",canBoList,false);
    }
    public static void themNhanVien(){
        System.out.println("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh (dd/mm/yyyy)");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính (Nam hoặc Nữ)");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập công việc (PV-trong nhà hoặc PV-ngoài trời)");
        String bac = scanner.nextLine();
        canBoList.add(new NhanVien(hoTen,namSinh,gioiTinh,diaChi,bac));
        DocGhiFile.ghiFile("canbo.csv",canBoList,false);
    }
}
