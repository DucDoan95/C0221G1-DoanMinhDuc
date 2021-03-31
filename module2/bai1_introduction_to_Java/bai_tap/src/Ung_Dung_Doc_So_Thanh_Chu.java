import java.util.Scanner;

public class Ung_Dung_Doc_So_Thanh_Chu {
    private static String one_to_ten(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";

        }
    }

    private static String ten_to_twenty(int n) {
        switch (n) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "twenty";
            default:
                return "";
        }
    }

    private static String twenty_to_ninety(int n) {
        switch (n) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    private static String one_hundred_to_nine_hundred(int n) {
        switch (n) {
            case 1:
                return "one hundred";
            case 2:
                return "two hundred";
            case 3:
                return "three hundred";
            case 4:
                return "four hundred";
            case 5:
                return "five hundred";
            case 6:
                return "six hundred";
            case 7:
                return "seven hundred";
            case 8:
                return "eight hundred";
            case 9:
                return "nine hundred";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        String result = "", str1 = "", str2 = "", str3 = "", str4 = "";
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        num1 = num % 10;
        num2 = num % 100 / 10;
        num3 = num % 1000 / 100;
        if (num1 == 0) {
            num1 = -1;
        }

        if (num >= 0 && num < 10) {
            str1 = one_to_ten(num);
            result = str1;
        } else if (num < 20) {
            str2 = ten_to_twenty(num);
            result = str2;
        } else if (num >= 20 && num <= 99) {
            str1 = one_to_ten(num1);
            str3 = twenty_to_ninety(num2);
            result = str3 + " " + str1;
        } else if (num >= 100 && num <= 999) {
            str1 = one_to_ten(num1);
            str3 = twenty_to_ninety(num2);
            str4 = one_hundred_to_nine_hundred(num3);
            result = str4 + " " + str3 + " " + str1;
        } else {
            result = "out of ability";
        }
        System.out.println(result);
    }
}
