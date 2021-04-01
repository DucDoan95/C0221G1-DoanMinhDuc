package bai_tap;

public class Hien_Thi_So_Nguyen_To_Nho_Hon_100 {
    public static void main(String[] args) {
        String soNT = "";
        for (int i = 0; i < 100; i++) {
            if (kiemTraSoNguyenTo(i)) {
                soNT += i + " ";
            }
        }
        System.out.println(soNT);
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
