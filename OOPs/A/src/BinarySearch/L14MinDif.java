package BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class L14MinDif {
    public static void main(String[] args) {
        int[] arr = {1,3,8,10};
        System.out.println(min_diff(arr,12));
        Set<Integer>set = new HashSet<>();

    }


    public static int min_diff(int[] arr,int target){
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
        if (e < 0) {
            return arr[s]; // Return the actual value at index s
        } else if (s >= arr.length) {
            return arr[e]; // Return the actual value at index e
        }
        //e s
        if (Math.abs(arr[e]-target)>Math.abs(arr[s]-target)){
            return arr[s];
        }else {
            return arr[e];
        }
    }
}
