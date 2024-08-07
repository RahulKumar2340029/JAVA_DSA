import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode7 {
    public static void main(String[] args) {
//        System.out.println(isHappy(19));
        int[] nums = {1,1,4,2,1,3};
//        System.out.println(findKthLargest(nums,2));
        System.out.println(heightChecker(nums));
        String s = "hello";

        System.out.println(s.replaceAll("l","k"));
        rotate(nums,3);
    }
    public static void rotate(int[] arr, int k) {
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[arr.length-k+i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i] = arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int heightChecker(int[] heights) {
        int[] heights1 = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            heights1[i] = heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=heights1[i]){
                count++;
            }
        }
        return count;
    }


        public static int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length-k];
        }

    public static boolean isHappy(int n){
        int a,b;
        a = b = n;
        do{
            a = sumOfNumber(a);
            b = sumOfNumber(sumOfNumber(b));

        }while(a!=b);
        return (a==1);
    }
    public static int sumOfNumber(int n){
        int sum=0;
        while(n>0){
            int ld = n%10;
            sum+=ld*ld;
            n/=10;
        }
        return sum;

    }
}
