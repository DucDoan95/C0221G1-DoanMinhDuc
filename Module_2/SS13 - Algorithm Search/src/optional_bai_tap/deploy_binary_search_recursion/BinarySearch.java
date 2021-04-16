package optional_bai_tap.deploy_binary_search_recursion;

public class BinarySearch {
   static int binarySearch(int[] arr,int key,int low,int high){

        if(high>=low){
            int mid =(low+high)/2;
            if(arr[mid]>key){
                return binarySearch(arr,key,low,mid-1);
            }else if(arr[mid]==key){
                return mid;
            }else {
                return binarySearch(arr,key,mid+1,high);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] test = {1,2,3,4,5,6,7,8,9,10};
        int low =0;
        int high = test.length;
        System.out.println(binarySearch(test,8,low,high));
    }
}
