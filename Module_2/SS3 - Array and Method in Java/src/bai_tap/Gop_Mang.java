package bai_tap;

public class Gop_Mang {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int [] arr = new int[arr1.length+arr2.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(i<arr1.length){
                arr[i]=arr1[i];
            }else {
                arr[i]=arr2[j];
                j++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
