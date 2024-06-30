import java.util.*;

public class leetcode6 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};

//        System.out.println(noofdistinct(arr,0,3));
////        System.out.println(Arrays.toString(productExceptSelf(arr)));
//        int[] arr2 = {3,2,1,0,4};
////        System.out.println(canJump(arr2));
//        System.out.println(isPerfectSquare(1));
    }
    public static boolean isPerfectSquare(int num) {
        for(int i=0;i<=num/2+1;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
    //55
    public static boolean canJump(int[] nums) {
        int max = min(nums);
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(-nums[0]+nums[i])>nums[max]){
                max = i;
            }
        }
        if (max==nums.length-1) return true;
        return false;
    }
    public static int min(int [] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr[min]){
                min= i;
            }
        }
        return min;
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==0 && i==0){
                ans[i] = prod(nums,i+1, nums.length-1);
            }
            if (nums[i]==0){
                for (int j = 0; j<i ; j++) {
                    ans[i] = prod(nums,0,i-1);
                }
                for (int j = i+1; j <nums.length ; j++) {
                    ans[i] = prod(nums, i+1, nums.length)-i;
                }
            }else{

            ans[i] = prod(nums,0, nums.length)/nums[i];
            }
        }
        return ans;
    }
    public static int prod(int[] arr,int s,int e){
        int product = 1;
        for (int i = s; i <e ; i++) {
            product*=arr[i];
        }
        return product;
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return countkdistinct(nums,k) - countkdistinct(nums,k-1);
    }
    public static int countkdistinct(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < nums.length){
            map.put(nums[j++],map.getOrDefault(nums[j++],0)+1);
            while (map.size()>k){
                int left = nums[i++];
                map.put(left,map.get(left)-1);
                if (map.get(left)==0){
                    map.remove(left);
                }
            }
            count+=j-i+1;

        }
        return count;
    }

}
