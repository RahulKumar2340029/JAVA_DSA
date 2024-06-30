package Hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.System;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) throws IOException {
        int[] arr = {4,5,6,6,6,4,5,6,5,5,5,4,5,4,5};
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());
//        System.out.println(n);
        sort(arr);
        System.out.println(Arrays.toString(arr));
        Queue<Integer> a = new LinkedList<>();

        a.add(12);
        a.add(24);
        a.add(36);
        a.add(48);
        a.add(60);
        Iterator<Integer> i = a.iterator();
        while (i.hasNext()){
            Integer s = i.next();
            System.out.println(s);
        }
//        for(int ele:a){
//            System.out.print(ele+" ");
//        }
        System.out.println();
        System.out.println(a.size());

    }
    public static void sort(int[]arr){
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while (mid<=end){
            if (arr[mid]==4){
                swap(arr,start,mid);
                start++;mid++;
            }else if (arr[mid]==5){
                mid++;
            }else if (arr[mid]==6){
                swap(arr,mid,end);
                end--;
            }
        }
    }
    private static void swap(int[] arr,int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;

    }
}
