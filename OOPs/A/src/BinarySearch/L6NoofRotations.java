package BinarySearch;

public class L6NoofRotations {
    public static void main(String[] args) {
        int[] arr = {11,12,13,1,2,3,4};//age ane m 3 rotation 12 13 1 2 3 4 11 -> 13 1 2 3 4 11 12 -> 1 2 3 4 11 12 13
        System.out.println(Rotatedcount(arr));
    }
    public static int Rotatedcount(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%arr.length;
            int prev = (mid+ arr.length-1)%arr.length;
            if (arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            if (arr[start]<=arr[mid]){
                start = mid+1;
            }else if (arr[mid]<=arr[end]){
                end = mid-1;
            }
        }
        return 0;
    }

}
