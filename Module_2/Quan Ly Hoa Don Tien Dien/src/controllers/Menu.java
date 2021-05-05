package controllers;

import java.util.Scanner;

public class Menu {
    public static void menuQuanLyHoaDon(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới khách hàng.\n" +
                    "2. Hiện thị thông tin khách hàng.\n" +
                    "3. Tìm kiếm khách hàng.\n" +
                    "4. Thêm mới hóa đơn.\n" +
                    "5. Chỉnh sửa hóa đơn.\n" +
                    "6. Hiện thị thông  tin chi tiết hóa đơn.\n" +
                    "7. Thoát.\n");
            switch (scanner.nextLine()){
                case "1":
                    menuThemKhachHang();
                    System.out.println("\n");
                    break;
                case "2":
                    HienThiKhachHang.hienThiKhachHang();
                    System.out.println("\n");
                    break;
                case "3":
                    TimKiemKhachHang.timKiemKH();
                    System.out.println("\n");
                    break;
                case "4":
                    ThemHoaDon.themHoaDon();
                    System.out.println("\n");
                    break;
                case "5":
                    break;
                case "6":
                    HienThiHoaDon.hienThiHoaDon();
                    break;
                case "7":
                    System.exit(0);
            }
        }
    }
    public static void menuThemKhachHang(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm khách hàng Việt Nam.\n" +
                    "2. Thêm khách hàng Nước Ngoài.\n"+
                    "3. Thoát.");
            switch (scanner.nextLine()){
                case "1":
                    ThemKhachHang.themKhachHangVN();
                    break;
                case "2":
                    ThemKhachHang.themKhachHangNN();
                    break;
                case "3":
                    System.exit(0);
            }
        }
    }
}
