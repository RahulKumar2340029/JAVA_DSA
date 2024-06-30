package StackAV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NSE1 {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        System.out.println(Arrays.toString(NearestSmallerElementToLeft(arr)));
    }
    public static int[] NearestSmallerElementToLeft(int[] arr){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            if (stack.isEmpty()){
                list.add(-1);
            }else if (!stack.isEmpty() && stack.peek()<arr[i]){
                list.add(stack.peek());
            }else if (!stack.isEmpty() && stack.peek()>=arr[i]){
                while (!stack.isEmpty() && stack.peek()>=arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    list.add(-1);
                }else{
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        return list.stream().mapToInt(p->p).toArray();
    }
}
