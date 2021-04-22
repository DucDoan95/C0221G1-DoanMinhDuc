package bai_tap;

public class InsertSortStep {
    void sort(int arr[])
    {
        for (int i = 1; i < arr.length; i++){
            int currentElement = arr[i];
            int k;
            System.out.println("Step"+i);
            for(k = i - 1; k >=0 && arr[k] > currentElement; k--){
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
            printArray(arr);
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 1,6,3,7,0,8};
        InsertSortStep insertSortStep = new InsertSortStep();
        insertSortStep.sort(arr);;
    }
}
