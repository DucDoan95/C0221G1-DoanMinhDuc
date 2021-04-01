package bai_tap;

import java.util.Scanner;

public class Dem_So_Lan_Xuat_Hien_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi = scanner.nextLine();
        System.out.println("Nhập ký tự tìm kiếm");
        char kyTu = scanner.nextLine().charAt(0);
        int count =0;
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i)==kyTu){
                count++;
            }
        }
        System.out.println("Ký tự "+kyTu+" xuất hiện "+count+" lần");
    }
}
