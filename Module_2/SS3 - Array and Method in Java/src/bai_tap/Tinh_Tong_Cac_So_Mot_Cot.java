package bai_tap;

import java.util.Scanner;

public class Tinh_Tong_Cac_So_Mot_Cot {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{2,4,9},{6,7,8}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Bạn muốn tính tổng cột nào ? ");
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int row = scanner.nextInt();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(j+1==row){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của cột "+row+" là: "+sum);
    }
}
