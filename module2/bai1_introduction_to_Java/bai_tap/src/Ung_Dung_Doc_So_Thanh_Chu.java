import java.util.Scanner;

public class Ung_Dung_Doc_So_Thanh_Chu {
    private static String find1To20(int n) {
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
                return "ninety";
            default:
                return "";

        }
    }


    private static String find20To99(int n) {
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

    private static String find100To999(int n) {
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

    public static String output1To19(int num) {
        return find1To20(num);
    }

    public static String output20To99(int num) {
        int unit = num % 10;
        int dozen = num / 10;
        if (unit == 0) {
            return find20To99(dozen);

        } else {
            return find20To99(dozen) + " " + find1To20(unit);
        }
    }

    public static String output100To999(int num) {
        int unit = num % 10;
        int dozen = num % 100 / 10;
        int hundred = num / 100;
        if (dozen == 0 && unit == 0) {
            return find100To999(hundred);
        } else if (dozen == 0 && unit != 0) {
            return find100To999(hundred) + " and " + find1To20(unit);
        } else if (dozen != 0 && unit != 0) {
            return find100To999(hundred) + " " + find20To99(dozen) + " " + find1To20(unit);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        if (num < 20) {
            System.out.println(output1To19(num));
        } else if (num <= 99) {
            System.out.println(output20To99(num));
        } else if (num <= 999) {
            System.out.println(output100To999(num));
        } else {
            System.out.println("out of");
        }
    }
}

