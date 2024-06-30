package SDEstriver;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {4,5,6,1,2,3};
//        System.out.println(binary_search(arr,0,arr.length-1,13));
//        System.out.println(Arrays.toString(firstAndLastOccur(arr,8)));
//        System.out.println(single(arr));
//        System.out.println(peak_ele(arr));
//        System.out.println(searchInARotatedSortedArrayII(arr,0));
        System.out.println(find_min(arr));

    }
//    min in rotated sorted array
    static int find_min(int[] arr){
        int s =0,e = arr.length-1;
        while (s<=e){
            int mid = (s+e)>>>1;
            if (arr[mid]<=arr[s] && arr[mid] <=arr[e]){
                return mid;
            }
            if (arr[mid]>=arr[s]){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }

    //search in rotated sorted array
    public static boolean searchInARotatedSortedArrayII(int []arr, int val) {
        // Write your code here.
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) >>> 1;
            if (val == arr[mid]) {
                return true;
            }
            if(arr[s]==arr[mid] && arr[mid]==arr[e]){
                s++;e--;
//                contiue until this condition fails
                continue;
            }
            if (arr[s] <= arr[mid]) {
                //left array is sorted
                if (arr[s] <= val && val <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            if (arr[mid] <= arr[e]) {
                if (arr[mid] <= val && val <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return false;
    }

    //    single element using first and last occurence
    static int single(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (first_occurence(arr,arr[i])==last_occurence(arr,arr[i])){
                return arr[i];
            }
        }
        return -1;
    }

//   peak element


    //    single element in sorted array brute
    static int single1(int[] arr){

        for (int i = 0; i < arr.length; i++) {
           int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count==1){
                return arr[i];
            }
        }
        return -1;
    }
//    count occurences - bruteforce
    static int count_occ(int[] arr,int val){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==val){
                count++;
            }
        }
        return count;
    }
//    countoccurences - optimal
    static int count_occurences(int[] arr,int val){
        if (!binary_search(arr,0,arr.length-1,val)){
            return -1;
        }else{
            return last_occurence(arr,val)-first_occurence(arr,val)+1;
        }
    }
//    bruteforce first or last occurence
    static int[] first_last_occurence(int[] arr,int val){
        int f = first_occ(arr,val);
        int l = last_occ(arr,val);
        return new int[]{f,l};
    }

    private static int first_occ(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==val){
                return i;
            }
        }
        return -1;
    }

    private static int last_occ(int[] arr, int val) {
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]==val){
                return i;
            }
        }
        return -1;
    }
//    better
    static int first_occurence(int[] arr,int val){
        int s=0,e= arr.length-1;int result = -1;
        while (s<=e){
            int mid = (s+e)>>>1;
            if (arr[mid]==val){
                result = mid;
                e = mid-1;
            }else if (arr[mid]<val){
                s= mid+1;
            }else{
                e = mid-1;
            }
        }
        return result;
    }
    static int last_occurence(int[] arr,int val){
        int s=0,e=arr.length-1,result = -1;
        while (s<=e){
            int mid = (s+e)>>>1;
            if (arr[mid]==val){
                result = mid;
                s = mid+1;
            }else if (arr[mid]<val){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return result;
    }

    static int[] firstAndLastOccur(int[] arr,int val){
        int f = first_occurence(arr,val);
        int l = last_occurence(arr,val);
        return new int[]{f,l};
    }
    //    floor and ciel in sorted array
    static int[] floor_ceil(int[] arr,int val){
        int s=0,e = arr.length-1,result1 = -1,result2 = -1;
        while (s<=e){
            int mid = (s+e)>>>1;
            if (val==arr[mid]){
                return new int[]{val,val};
            }else if (val>arr[mid]){
                result1 = mid;
                s = mid+1;
            }else if (val<arr[mid]){
                result2 = mid;
                e = mid-1;
            }
        }
        return new int[]{arr[result1],arr[result2]};
    }
//    search insert position
    static int insert_at_correct_index(int[] arr,int val){
        int s=0,e=arr.length-1,result = -1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if (val==arr[mid]){
                return mid;
            }else if (val>arr[mid]){
                result = mid+1;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return result;
    }
//    upperbound
    static int upper_bound(int[] arr,int val){
        int s=0,e=arr.length-1,result = -1;
        while (s<=e){
            int mid= s+(e-s)/2;
            if (val==arr[mid]){
                return mid;
            }else if (val<arr[mid]){
                result = mid;
                e=  mid-1;
            }else{
                s = mid+1;
            }
        }
        return result;
    }
//    lower bound
    static int lower_bound(int[] arr,int target){
        int s = 0;int result = -1;
        int e =arr.length-1;
        while (s<e){
            int mid = s+(e-s)/2;
            if (target==arr[mid]){
                return mid;
            }else if (target<arr[mid]){
                e = mid-1;
            }else if (target>arr[mid]){//arr[mid] se bda h target yani floor
                result = mid;
                s = mid+1;
            }
        }
        return result;
    }
    static boolean binary_search(int[] arr,int s,int e,int target){
        if (s>e) return false;//Remember this base condition
        int mid = s+(e-s)/2;
        if (target>arr[mid]){
            return binary_search(arr,mid+1,e,target);
        }else if (arr[mid]==target){
            return true;
        }
        else{
            return binary_search(arr,s,mid-1,target);
        }

    }
}
