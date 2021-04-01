package bai_tap;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần tử: ");
        int element = scanner.nextInt();
        int[] array = new int[element];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị phàn tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        addElementArray(array);

    }

    public static void addElementArray(int[] arr) {
        System.out.println("Nhập vị trí cần thêm: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println("Nhập giá trí cần thêm: ");
        int newElement = scanner.nextInt();
        int[] newArray = new int[arr.length + 1];
        System.out.println(newArray.length);
        for (int i = 0; i < newArray.length; i++) {
            if (i < index - 1) {
                newArray[i] = arr[i];
            } else if (i == index - 1) {
                newArray[i] = newElement;
            } else if (i > index - 1) {
                newArray[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
