package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class L12Infinite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*i+3;
        }
        System.out.println(arr[50]);
        System.out.println(SearchInInfSortedArr(arr,103));
    }
    public static int SearchInInfSortedArr(int[] arr,int t){
        int s = 0;
        int e = 1;
        while (arr[e]<=t){
            if (arr[e]<t){
                s = e;
                e = 2*e;

            }else if (arr[e]==t){
                return e;
            }
        }
        return BinarySearch(arr,t,s,e);
    }
    public static int BinarySearch(int[] arr,int target,int s,int e){
//        int s = 0;
//        int e = arr.length-1;
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
