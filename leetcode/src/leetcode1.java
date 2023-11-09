import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class leetcode1 {
    public static void main(String[] args) {

        int[] arr = {5,3,2,1,6,5};
        System.out.println(isPalindrome("heloleh"));
//        System.out.println(find132pattern(arr));
//        System.out.println(myPow(
//                0.01
//                ,Integer.MIN_VALUE));
//        System.out.println(majorityElement(arr));
//        System.out.println(Arrays.toString(plusOne(arr)));
//        System.out.println(maxProfit(arr));
//        System.out.println(ninjaAndRangeMax(5,3,4,arr));
//        System.out.println(reverse("gof"));
        System.out.println(reverseWords("i am rahul kumar"));
    }
    public static boolean isPalindrome(String s){
        int start = 0;int end = s.length()-1;int flag=0;
        for (int i = start; i <end ; i++,end--) {
            if (s.charAt(i)==s.charAt(end)){
                flag++;
            }
        }
        if (flag==s.length()/2) return true;
        return false;
    }
//    public static boolean isPalindrome(String s){
//        int start=0;int end=s.length()-1;
//        while (start<end){
//            if (s.charAt(start)!=s.charAt(end)){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
    public static String reverseWords(String s) {
        int prev = -1;
        int i=0;
        String ans = "";
        for(;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans += (reverse(s,prev+1,i-1)+" ");
            prev=i;
            }
        }
        ans += (reverse(s,prev+1,i-1)+" ");
        return ans.trim();
    }
    public static String reverse(String s,int start,int end){
//        int start=0;
//        int end = s.length()-1;
        String ans = "";
        while(start<=end){
            ans=s.charAt(start)+ans;
            start++;
        }
        return ans;
    }
   public static int ninjaAndRangeMax(int n, int x, int y, int[] a) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            if (a[i]>x&&a[i]<y) {
                return a[i];
            }
        }
        return -1;
    }
    public static boolean find132pattern(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]<nums[j]&&nums[k]>nums[i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static double myPow(double x, int n) {
        if (x<1&&n>10) return 0;
        if (x<0.01&&n<-10){
            x=1/x;n=-n;
            return myPow(x,n);
        };
        if (n>0){

            if (x==1||n==0) return 1;
            return x*myPow(x,n-1);
        }else{
            if (x==1||-n==0) return 1;
            return (1/x)*myPow(x,n+1);
        }
    }
    public static int majorityElement(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
        int count=0;
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count>nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }
    public static int[] plusOne(int[] digits) {

        if (digits.length==1){
            if (digits[0]==9){
                int[] ans2 = new int[2];
                ans2[0] = 1;ans2[1] = 0;return ans2;
            }else {
                digits[0]+=1;
                return digits;
            }
        }
        int[] ans = new int[digits.length+1];
        if (digits[digits.length-1]<9){
            digits[digits.length-1] = digits[digits.length-1]+1;
        }else{
//            Arrays.sort(digits);
            if (digits[0]==digits[1]){
                ans[0] = 1;

            }
            for (int i = digits.length-1; i >0 ; i--) {
                if (digits[i]==digits[i-1]){
                    digits[i]=0;
                }else{
                    digits[i]=0;
                    digits[i-1]+=1;
                    break;
//                    digits[i-1]+=1;
                }
            }
        }
        return digits;
    }
}
