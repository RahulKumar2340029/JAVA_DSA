import java.util.*;
interface Addable{
    int add(int a,int b);
}
class Pair{
    int first, second;
    Pair(int a,int b){
        this.first=a;
        this.second=b;
    }
}
class MinStack{
    Stack<Pair> minstack;
    int min;
    MinStack(){
        minstack = new Stack<>();
        min = 0;
    }
    void push(int n){
      if(minstack.isEmpty()){
          min = n;
          minstack.push(new Pair(n,min));
      }
        min = Math.min(n,minstack.peek().second);
      minstack.push(new Pair(n,min));
    }
    int minimum(){
        if (minstack.isEmpty()){
            return min;
        }else{
            return minstack.peek().second;
        }
    }
    void pop(){
        minstack.pop();
    }
    int peek(){
        int data  = minstack.peek().first;
        return data;
    }
}
public class Main {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("apple", "banana", "cherry");
//        list.forEach(System.out::println);
//        Addable ad1 = Integer::sum;
//        System.out.println(ad1.add(5,6));
//        MinStack m = new MinStack();
////        m.push(1);
////        m.push(-1);
//        System.out.println(m.minimum());
//        int[] arr = {1,3,-1,-3,5,3,6,7};
//        System.out.println(Arrays.toString(swm(arr,3)));
        extractUnique("ababacd");
    }
    public static String removeKdigits(String num, int k) {
        Stack<Character> st= new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()>0?sb.toString():"0";

    }
    public static int[] swm(int[] arr,int k){
        int i =0;int j=0;
        int[] nums = new int[arr.length-k+1];
        if (k==1) return nums;
        int idx = 0;
        while (j<arr.length){
            while (j-i+1!=k){
                j++;
            }
            nums[idx++] = lii(arr,i,j);
            i++;j++;
        }
        return nums;
    }
    public static int lii(int[] arr,int i,int j){
        int max = Integer.MIN_VALUE;
        for (int k = i; k <j+1 ; k++) {
            max = Math.max(arr[k],max);
        }
        return max;
    }
    public static void extractUnique(String s){
        Map<Character,Boolean> map= new HashMap<>();
        for(char ch:s.toCharArray()){
            if (!map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, false) || true);
            }
        }
        for(Map.Entry<Character,Boolean> e:map.entrySet()){
            if (e.getValue()) { // Check if the value is true
                System.out.println(e.getKey());
            }
        }
    }

}