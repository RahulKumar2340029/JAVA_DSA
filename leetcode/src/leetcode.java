import java.util.Arrays;
import java.util.Stack;

public class leetcode {
    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{3,1,2,4}));
        System.out.println(longest("()((()())"));
        int[] arr = new int[10000];
        Arrays.fill(arr,26);
        System.out.println(find132pattern(arr));
    }
    static int sumSubarrayMins(int[] arr){
        int ans=0;int mod = (int)(Math.pow(10,9)+7);
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(min,arr[j]);
                ans+=min;
                ans%=mod;
            }
        }
        return ans;
    }
    static int longest(String str){
        if (str.isEmpty()) return 0;
        Stack<Character> st = new Stack<>();int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if (!st.isEmpty() && str.charAt(i)==')'){
                if (st.peek()=='('){
                    cnt+=2;
                    st.pop();
                }
            }else{
                st.push(str.charAt(i));
            }
        }
        return cnt;
    }
    public static boolean find132pattern(int[] nums) {
        if (nums.length<3) return false;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[j]>nums[k] && nums[i]<nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
