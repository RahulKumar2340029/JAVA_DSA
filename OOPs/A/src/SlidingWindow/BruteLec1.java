package SlidingWindow;

import java.util.Scanner;

public class BruteLec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
//        int[] arr = {2,3,5,2,9,7,1};
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Maximum: "+sliding_window1_max_size(arr,n,3));
    }
//    sliding window approach
    static int sliding_window1_max_size(int[] arr,int n,int k){
       int i=0,j=0,sum = 0,max = Integer.MIN_VALUE;
       while (j<n){
           sum+=arr[j];
           if (j-i+1<k){
               j++;
           }else if (j-i+1==k){
               //shift enter for next line
               max = Math.max(max,sum);
               sum-=arr[i];
               i++;j++;
           }
       }
       return max;
    }
    static int subarr_max(int[] arr,int k){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-k+1; i++) {
            int sum=0;
            for (int j = i; j < i+k; j++) {
                sum+=arr[j];
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
