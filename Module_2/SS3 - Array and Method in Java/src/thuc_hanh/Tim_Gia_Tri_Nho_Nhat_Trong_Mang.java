package thuc_hanh;

public class Tim_Gia_Tri_Nho_Nhat_Trong_Mang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }

    private static int minValue(int[] arr) {
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (num>=arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }
}
