package StackAV;

import java.util.*;

public class NSE2 {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        System.out.println(Arrays.toString(NearestSmallerElementToRight(arr)));
    }
    public static int[] NearestSmallerElementToRight(int[] arr){
        List<Integer> list  = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (stack.isEmpty()){
                list.add(-1);
            }else if(!stack.isEmpty() && stack.peek()<arr[i]){
                list.add(stack.peek());
            }else if(!stack.isEmpty() && stack.peek()>=arr[i]){
                while (!stack.isEmpty() && stack.peek()>=arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    list.add(-1);
                }else {
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        List<Integer> result = list.reversed();
        return result.stream().mapToInt(p->p).toArray();
    }


}
