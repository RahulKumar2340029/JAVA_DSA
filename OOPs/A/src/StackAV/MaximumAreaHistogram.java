package StackAV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(MaxAreaBin(arr,4,4));
    }
    public static int MaxAreaBin(int[][] arr,int m,int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            list.add(arr[0][j]);
        }
        int max = MaxArea(list.stream().mapToInt(p->p).toArray());
        for (int i = 1; i < m;) {
            for (int j = 0; j <n ; j++) {
                if (arr[i][j]==0){
                    list.set(j,0);
                }else {
                    list.set(j,list.get(i)+arr[i][j]);
                }
                max = Integer.max(max,MaxArea(list.stream().mapToInt(p->p).toArray()));
            }
            return max;
        }
        return -1;
    }

    public static int MaxArea(int[] arr){
        int[] left = NSL(arr),right=NSR(arr);
        int[] width = new int[arr.length];int[] area = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            width[i] = right[i]-left[i]-1;
        }
        for (int i = 0; i < arr.length; i++) {
            area[i] = width[i]*arr[i];
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (area[i]>max){
                max = area[i];
            }
        }
        return max;

    }
    public static int[] NSL(int[] arr){
        List<Integer> list = new ArrayList<>();
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int pseudoindex = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (stack.isEmpty()){
                list.add(pseudoindex);
            }else if (!stack.isEmpty() && stack.peek().first<arr[i]){
                list.add(stack.peek().second);
            }else if (!stack.isEmpty() && stack.peek().first>=arr[i]){
                while (!stack.isEmpty() && stack.peek().first>=arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    list.add(pseudoindex);
                }else{
                    list.add(stack.peek().second);
                }
            }
            stack.push(new Pair<>(arr[i],i));
        }
        return list.stream().mapToInt(p->p).toArray();
    }
    public static int[] NSR(int[] arr){
        List<Integer> list  = new ArrayList<>();
        int pseudoindex = arr.length;
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (stack.isEmpty()){
                list.add(pseudoindex);
            }else if(!stack.isEmpty() && stack.peek().first<arr[i]){
                list.add(stack.peek().second);
            }else if(!stack.isEmpty() && stack.peek().first>=arr[i]){
                while (!stack.isEmpty() && stack.peek().first>=arr[i]){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    list.add(pseudoindex);
                }else {
                    list.add(stack.peek().second);
                }
            }
            stack.push(new Pair<>(arr[i],i));
        }
        List<Integer> result = list.reversed();
        return result.stream().mapToInt(p->p).toArray();
    }
}
