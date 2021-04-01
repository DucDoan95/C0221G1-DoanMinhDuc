package bai_tap;

public class Hai_Muoi_So_Nguyen_To_Dau_Tien {
    public static void main(String[] args) {
        String soNT = "";
        int count = 0;
        for (int i = 0; ; i++) {
            if (kiemTraSoNguyenTo(i)) {
                soNT += i + " ";
                count++;
                if (count == 20) {
                    break;
                }
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
