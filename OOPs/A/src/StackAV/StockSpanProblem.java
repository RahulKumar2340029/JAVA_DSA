package StackAV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
//REVISION NEEDED

public class StockSpanProblem {

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(StockSpan(arr)));
    }
    public static int[] StockSpan(int[] arr){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        ArrayList<Integer> result  = new ArrayList<>();
        int pseudocode=-1;
        for (int i = 0; i <arr.length ; i++) {
            if (stack.isEmpty()){
                result.add(pseudocode);
            }else if (stack.size()>0 && stack.peek().first>arr[i]){
                result.add(stack.peek().second);
            }else if (stack.size()>0 && stack.peek().first<=arr[i]){
                while (stack.size()>0 && stack.peek().first<=arr[i]){
                    stack.pop();
                }
                if (stack.size()==0){
                    result.add(pseudocode);
                }else{
                    result.add(stack.peek().second);
                }
            }
            stack.push(new Pair<>(arr[i],i));

        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <result.size() ; i++) {
            list.add(i-result.get(i));
        }
        return (list.stream().mapToInt(Integer::intValue).toArray());
    }

}
