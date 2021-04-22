package bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class Triangle extends Throwable {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int a, b, c;
                System.out.print("input A: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("input B: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("input C: ");
                c = Integer.parseInt(scanner.nextLine());
                IllegalTriangleException(a, b, c);
                System.out.println("correct it is triangle");
                break;
            } catch (Triangle e) {
                System.out.println("unCorrect triangle");
            } catch (NumberFormatException e) {
                System.out.println("input need be number format");
            }
        }
    }

    public static void IllegalTriangleException(int a, int b, int c) throws Triangle {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Triangle();
        }
    }
}
