package SlidingWindow;

public class BruteLec1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,9,7,1};
        System.out.println(sliding_window1(arr,7,3));
    }
//    sliding window approach
    static int sliding_window1(int[] arr,int n,int k){
        int i=0,j=0;int sum=0;int max = Integer.MIN_VALUE;
        while (j<arr.length){
            sum+=arr[j];
            if (j-i+1<k) j++;
            else if (j-i+1==k){
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
