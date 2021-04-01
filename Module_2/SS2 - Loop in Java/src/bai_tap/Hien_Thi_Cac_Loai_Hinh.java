package bai_tap;

import java.util.Scanner;

public class Hien_Thi_Cac_Loai_Hinh {
    public static void main(String[] args) {
        int choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông");
            System.out.println("3. Vẽ tam giác vuông ngược");
            System.out.println("0. Exit");
            System.out.println("Nhập số chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình chữ nhật nè");
                    hienThiHinhChuNhat(5, 7);
                    break;
                case 2:
                    System.out.println("Vẽ hình tam giác vuông nè");
                    hienThiHinhTamGiacVuong(6);
                    break;
                case 3:
                    System.out.println("Vẽ hình tam giác vuông ngược nè");
                    hienThiHinhTamGiacVuongNguoc(6);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chưa chọn nè!");
            }
        }
    }

    public static void hienThiHinhChuNhat(int chieuDai, int chieuRong) {
        for (int i = 0; i < chieuDai; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hienThiHinhTamGiacVuong(int chieuCao) {
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hienThiHinhTamGiacVuongNguoc(int chieuCao) {
        for (int i = chieuCao; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
