import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode5 {
    public static void main(String[] args) {
        int []arr = {10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = {4,5,6,7,0,2,1,3};
        int[] arr3 = {52,-91,72};
        int[] arr4 = {1,1,2,2};
        System.out.println(removeDuplicates(arr4));
//        System.out.println(Arrays.toString(removeDuplicates(arr4)));
//        System.out.println(largestAltitude(arr3));
//        System.out.println(maxArea(arr));
//        System.out.println(backspace("a#b#c"));
//        System.out.println(backspaceCompare("ab##","d#c#"));
//        System.out.println(System.currentTimeMillis()) ;
//        System.out.println(Arrays.toString(shuffle(arr,5)));
//        System.out.println(restoreString("codeleet",arr2));
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        if (nums[nums.length-1]!=nums[nums.length-2]){
            list.add(nums[nums.length-1]);
        }

        return list.toArray().length;

    }

    //countitems matching a rule
    public static int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        ans[0] = 0;
        for(int i=0;i<gain.length-1;i++){
            ans[i+1] = gain[i]+gain[i+1];
            gain[i+1] = ans[i+1];
        }
        return maximum(ans);
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //string 2
    public static String restoreString(String s, int[] indices) {
//        char[] c = s.toCharArray();
        char[] ans = new char[indices.length];
        for (int i = 0; i <indices.length ; i++) {
            ans[i] = s.charAt(indices[i]);
        }
        return Arrays.toString(ans);
    }
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <address.length() ; i++) {
            char c = address.charAt(i);
            if (c=='.'){
                ans.append("[.]");
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int[] ans1 = new int[n];
        int[] ans2 = new int[2*n];
        for(int i=0;i<n;i++){
            ans1[i]= nums[i];
        }
        for(int i=n;i<2*n;i++){
            ans2[i] = nums[i];
        }
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                result[i] = ans1[i];
            }else{
                result[i] = ans2[2*i-1];
            }
        }
        return result;
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count=0;
       int[][] ans = new int[m][n];
        for (int i = 0; i <indices.length ; i++) {
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }
            for (int j = 0; j <m ; j++) {
                ans[j][indices[i][1]]++;
            }
        }
        for (int row = 0; row < ans.length; row++) {
            for (int col = 0; col <ans[row].length ; col++) {
                if (ans[row][col]%2!=0){
                    count++;
                }
            }
        }
        return count;

    }


    public static boolean backspaceCompare(String s, String t) {
        if (backspace(s).equals(backspace(t))) return true;
        return false;
    }
    public static String backspace(String s){
        String ans = " ";
        StringBuilder ans2 = new StringBuilder(ans);
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!='#'){
                ans2.append(s.charAt(i));
            }else if (ans2.length()>1){
                ans2.deleteCharAt(ans2.length()-1);
            }
        }
        return ans2.toString();
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum= numBottles;int rem;
        while (numBottles>=numExchange){
            sum+=numBottles/numExchange;
            numBottles=numBottles%numExchange+numBottles/numExchange;
        }
        return sum;

    }
    public static int maxArea(int[] height) {
        int maxwater = Math.min(height[0],height[height.length-1] )*(height.length-1);
        int count=0;
        for(int i=0;i<height.length;i++){
            if(height[i]==height[0]){
                count++;
            }
        }
        if(count==height.length){
            return height[0];
        }
        for (int i = 1; i <height.length ; i++) {
            for (int j = i+1;j<height.length;j++) {
                if (maxwater<Math.min(height[i],height[j])*(j-i)){
                    maxwater= Math.min(height[i],height[j])*(j-i);
                }
            }
        }
        return maxwater;
    }
}
