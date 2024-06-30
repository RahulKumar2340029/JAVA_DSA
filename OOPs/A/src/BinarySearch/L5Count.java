package BinarySearch;

public class L5Count {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,10,10,10,12,14,16,19};
        System.out.println(Count(arr,10));
    }
    public static int Count(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int res = 0,res2=0;
        while (start<=end){
            int mid=  (start+end)>>>1;//to reduce overflow
            if (arr[mid]==target){
                res = mid;
                end = mid-1;
            }else if (arr[mid]<target){

                start = mid+1;
            }else if (arr[mid]>target){
                end = mid-1;
            }
        }
        start=0;
        end = arr.length-1;
        while (start<=end){
            int mid=  (start+end)>>>1;
            if (arr[mid]==target){

                res2 = mid;
                start = mid+1;
            }else if (arr[mid]<target){
                start = mid+1;
            }else if (arr[mid]>target){
                end = mid-1;
            }
        }
        return -res+res2+1;//length from first and last occurrence of target from array
    }
}
