package bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        deleteElementArray(array);
    }

    public static void deleteElementArray(int[] arr) {
        System.out.println("Nhập vị trí cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

}
