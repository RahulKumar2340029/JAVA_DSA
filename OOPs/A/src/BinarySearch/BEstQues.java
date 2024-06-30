package BinarySearch;

import java.util.Arrays;

public class BEstQues {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int ans = Allocate_min_no_of_pages(arr,2);
        System.out.println(ans);
        String s = new String();

    }
    static int Allocate_min_no_of_pages(int[] arr,int k){
        int s = max(arr);
        int e = Arrays.stream(arr).sum(),result = -1;
        if (arr.length<k){
            return -1;
        }
        while (s<=e){
            int mid = s+(e-s)/2;
            if (isValid(arr,arr.length,k,mid)){
                result = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return result;
    }

    private static boolean isValid(int[] arr, int n,int k, int maxPages) {
        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if (sum>maxPages){
                cnt++;
                sum=arr[i];
            }
        }
        return cnt <= k;
    }

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int ele:arr){
            if (ele>max){
                max = ele;
            }
        }
        return max;
    }
}
