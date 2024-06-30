package StackAV;

import java.util.*;
import java.util.Stack;

public class NGE1 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(Arrays.toString(NearestGreatestToRight(arr)));

    }
    public static int[] NearestGreatestToRight(int[] arr){
        List<Integer> result  = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (stack.isEmpty()){
                result.add(-1);
            }else if (stack.size()>0 && stack.peek()>arr[i]){
                result.add(stack.peek());
            }else if (stack.size()>0 && stack.peek()<=arr[i]){
                while (stack.size()>0 && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if (stack.size()==0){
                    result.add(-1);
                }else{
                    result.add(stack.peek());
                }
            }
            stack.push(arr[i]);

        }
        List<Integer> list = result.reversed();
        return (list.stream().mapToInt(Integer::intValue).toArray());
    }
}