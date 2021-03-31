import java.util.Scanner;

public class Ung_Dung_Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        double vnd =  23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money you want to exchange: ");
        usd = scanner.nextDouble();
        double change = usd *vnd;
        System.out.println(usd+" USD exchange to "+change+" VND");
    }
}
