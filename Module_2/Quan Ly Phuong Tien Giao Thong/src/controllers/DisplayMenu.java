package controllers;

import java.util.Scanner;

public class DisplayMenu {
    public static void hienThiMenu(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG:\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n" );
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "1":
                    menuThemPhuongTien();
                    break;
                case "2":
                    menuHienThiPhuongTien();
                    break;
                case "3":
                    menuXoaPhuongTien();
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
    public static void menuThemPhuongTien(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG:\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm xe tải\n" +
                    "2. Thêm ôtô\n" +
                    "3. Thêm xe máy\n" +
                    "4. Quay lại menu chính\n" );
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "1":
                    ThemPhuongTien.ThemXeTai();
                    break;
                case "2":
                    ThemPhuongTien.themOto();
                    break;
                case "3":
                    ThemPhuongTien.ThemXeMay();
                    break;
                case "4":
                    hienThiMenu();
                    break;
            }
        }

    }
    public static void menuHienThiPhuongTien(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG:\n" +
                    "Chọn chức năng:\n" +
                    "1. Hiển thị xe tải\n" +
                    "2. Hiển thị ôtô\n" +
                    "3. Hiển thị xe máy\n" +
                    "4. Quay lại menu chính\n" );
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "1":
                    HienThiPhuongTien.hienThiXeTai();
                    break;
                case "2":
                    HienThiPhuongTien.hienThiXeOto();
                    break;
                case "3":
                    HienThiPhuongTien.hienThiXeMay();
                    break;
                case "4":
                    hienThiMenu();
                    break;
            }
        }
    }
    public static void menuXoaPhuongTien(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG:\n" +
                    "Chọn chức năng:\n" +
                    "1. Xóa xe tải\n" +
                    "2. Xóa ôtô\n" +
                    "3. Xóa xe máy\n" +
                    "4. Quay lại menu chính\n" );
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "1":
                    XoaPhuongTien.xoaXeTai();
                    break;
                case "2":
                    XoaPhuongTien.xoaOto();
                    break;
                case "3":
                    XoaPhuongTien.xoaXeMay();
                    break;
                case "4":
                    hienThiMenu();
                    break;
            }
        }
    }
}
