package BinarySearch;

public class L1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch(arr,50));
    }
    public static int BinarySearch(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;//reduce overflow when arr is very large(int)
            if (arr[mid]<target){
                s = mid+1;
            }else if (arr[mid]>target){
                e = mid-1;
            }else if (arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
