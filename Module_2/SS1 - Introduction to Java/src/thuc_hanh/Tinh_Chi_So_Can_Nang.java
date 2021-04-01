package thuc_hanh;

import java.util.Scanner;

public class Tinh_Chi_So_Can_Nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
        double weight = scanner.nextDouble();
        System.out.print("Your height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2.0D);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18.0D) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0D) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0D) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
