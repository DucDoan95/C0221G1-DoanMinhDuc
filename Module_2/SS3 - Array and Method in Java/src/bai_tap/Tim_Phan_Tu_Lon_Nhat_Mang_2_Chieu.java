package bai_tap;

public class Tim_Phan_Tu_Lon_Nhat_Mang_2_Chieu {
    public static void main(String[] args) {

        int [][] array = {{1,2,3},{2,4,9},{6,7,8}};
        int temp=array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(array[i][j]>temp){
                    temp = array[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất là: "+temp);
    }
}
