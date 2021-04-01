package bai_tap;

public class Tinh_Tong_Duong_Cheo_Chinh {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{2,4,9},{6,7,8}};

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int sum=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là: "+sum);
    }
}
