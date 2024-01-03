package SDEstriver;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {9,62,12,200,1};
        insertion_recursive_sort(arr,0,arr.length-1);
//        bubble_recursive_sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    prob4 ----mergesort
    public static void merge_sort(int[] arr,int s,int e){
        int mid = s+(e-s)/2;
        if (s<e){
            merge_sort(arr,s,mid);
            merge_sort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }

    private static void merge(int[] arr, int s, int mid, int e) {

    }

    //    prob5 recursive bubble sort
    public static void bubble_recursive_sort(int[] arr,int n){
        if (n==1){
            System.out.println("Array sorted via bubble sort recursive!!");
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubble_recursive_sort(arr,n-1);
    }
//    prob6 ----Recursive insertion sort
    public static void insertion_recursive_sort(int[] arr,int s,int e){
        if (s==e) return;
        for (int i = 0; i <e-1 ; i++) {
            if (arr[s]>arr[s+1]){
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
        }
        insertion_recursive_sort(arr,s+1,e);
    }
//    prob3 insertion sort

    public static void insertion_sort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
//    prob2 bubble sort
    public static void bubble_sort(int[] arr){
        for (int i = 0; i <=arr.length-2 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
//    prob1 selection sort
    public static void selection_sort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }

            }
//                swap min and ith index
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
