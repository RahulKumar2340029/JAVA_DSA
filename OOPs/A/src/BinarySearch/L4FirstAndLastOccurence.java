package BinarySearch;

import java.util.Arrays;

public class L4FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,18,20};
        System.out.println(Arrays.toString(FirstandLast(arr,10)));
    }
    public static int[] FirstandLast(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1,res2=-1;
        while (start<=end){
            int mid=  (start+end)>>>1;
            if (arr[mid]==target){
                //for first occurence we have result1 but kyun na aur piche dekh lia jaaye kya pta aur piche mil jaaye
                //end = mid-1; nhi hua to result1 to hai hi
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
            //for last occurence we have result 2 astmp but kyun na aur aage dekh lia jaaye kya pta aage bhi ho
                //so start = mid+1;nhi hua to result2 to hai hi
                res2 = mid;
                start = mid+1;
            }else if (arr[mid]<target){
                start = mid+1;
            }else if (arr[mid]>target){
                end = mid-1;
            }
        }
        return new int[]{res,res2};
    }
}
