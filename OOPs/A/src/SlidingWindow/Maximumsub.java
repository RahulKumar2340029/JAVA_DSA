package SlidingWindow;
import java.util.*;

public class Maximumsub {
    public static void main(String[] args) {
        int[] arr = {-1,3,-2,4,5,6};
        System.out.println(longestPalindrome("babad"));
    }
    public static int longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public static boolean isPalindrome(String str){
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;e--;
        }
        return true;
    }

}
