package cp;

import java.util.Scanner;

public class capitalization {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        if (s.charAt(0)>='a' && s.charAt(0)<='z'){
//            char ch = (char) (s.charAt(0) - 32);
//            s = ch + s.substring(1);
//        }
//        System.out.println(s);
        int[] arr = {2,4,3};
        int k = 6;
        System.out.println(checkSubarraySum(arr,k));

    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1) return false;
        int[] presum = new int[nums.length + 1];
        presum[0] = 0;
        for(int i=1;i<=nums.length;++i){
            presum[i] = presum[i-1] + nums[i-1];
        }

        int r = 2;boolean flag = false;

        while(r<nums.length+1){
            for(int i=0;i<r-1;++i){
                if( presum[r] %k==0 || (presum[r] - presum[i])%k==0){
                    return true;
                }
            }
            r++;
        }
        return false;
    }

}
