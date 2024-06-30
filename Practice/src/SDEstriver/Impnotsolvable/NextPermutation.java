package SDEstriver.Impnotsolvable;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        next_permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start){
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;end--;
        }
    }

    public static void next_permutation(int[] arr){
        if (arr.length==1) return;
        if (arr.length==2){
            swap(arr,0,1);
            return;
        }
        int i = arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if (i >= 0) {
            int j = arr.length-1;
            while (j>=0 && arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);

    }

}
