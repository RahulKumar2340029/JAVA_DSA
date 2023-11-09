package com.rahul;

import java.util.ArrayList;
import java.util.Arrays;

public class recursion{
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,9,6};
        System.out.println(issorted(arr,0));
        System.out.println(search(arr,6,0));
        ArrayList<Integer> ans= findtarget(arr,9,0,new ArrayList<>());
        System.out.println(ans);
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static boolean issorted(int[] arr,int index){
        if (index == arr.length-1) return true;
        return arr[index]<arr[index+1]&&issorted(arr,index+1);
     }
    static int search(int[] arr,int target,int index){
         if (index==arr.length) return -1;
         if (arr[index]==target) {
             return index;
         }else{
             return search(arr,target,index+1);
         }
    }
    static ArrayList<Integer> findtarget(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index==arr.length) return list;
        if (target==arr[index]){
            list.add(index);
        }
            return findtarget(arr,target,index+1);

    }
    static ArrayList<Integer> findtarget(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length) return list;
        if (target==arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = findtarget(arr,target,index+1,list);
        list.addAll(ansfromBelowCalls);
        return list;


    }
    static void bubblesort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}