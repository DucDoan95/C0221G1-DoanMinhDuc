package controllers;

import java.util.Scanner;

public class QuanLyCanBo {
    static Scanner scanner = new Scanner(System.in);
    public static void menuChucNang(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ\n" +
                    "Chọn chức năng:\n" +
                    "1. Nhập thông tin mới cho cán bộ\n" +
                    "2. Tìm kiếm theo tên (tương đối).\n" +
                    "3. Sắp xếp theo tên.\n" +
                    "4. Hiển thị thông tin về danh sách các cán bộ.\n" +
                    "5. Thoát khỏi chương trình.\n");
            switch (scanner.nextLine()){
                case "1":
                    menuThemCanBo();
                    break;
                case "2":
                    TimKiem.timKiem();
                    break;
                case "3":
                    SapXep.sapXep();
                    break;
                case "4":
                    menuHienThiCanBo();
                    break;
                case "5":
                    System.exit(0);
                    break;

            }
        }
    }
    public static void menuThemCanBo(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm công nhân.\n" +
                    "2. Thêm kỹ sư.\n" +
                    "3. Thêm nhân viên\n" +
                    "4. Quay lại menu\n");
            switch (scanner.nextLine()){
                case "1":
                    ThemCanBo.themCongNhan();
                    break;
                case "2":
                    ThemCanBo.themKySu();
                    break;
                case "3":
                    ThemCanBo.themNhanVien();
                    break;
                case "4":
                    menuChucNang();
                    break;
            }
        }
    }
    public static void menuHienThiCanBo(){
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ\n" +
                    "Chọn chức năng:\n" +
                    "1. Hiển thị công nhân.\n" +
                    "2. Hiển thị kỹ sư.\n" +
                    "3. Hiển thị nhân viên\n" +
                    "4. Quay lại menu\n");
            switch (scanner.nextLine()){
                case "1":
                    HienThiCanBo.hienThiCongNhan();
                    break;
                case "2":
                    HienThiCanBo.hienThiKySu();
                    break;
                case "3":
                    HienThiCanBo.hienThiNhanVien();
                    break;
                case "4":
                    menuChucNang();
                    break;
            }
        }
    }
}
