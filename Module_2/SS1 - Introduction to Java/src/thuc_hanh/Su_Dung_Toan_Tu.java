package thuc_hanh;

import java.util.Scanner;

public class Su_Dung_Toan_Tu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        float width = scanner.nextFloat();
        System.out.println("Enter height: ");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}