package BinarySearch;

public class L7SearchinRSA {//RSA=Rotated Sorted Array

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(SearchInRotatedSortedArray(arr,0));
    }
    public static int SearchInRotatedSortedArray(int[] arr,int t){
        int min = Rotatedcount(arr);
        int s = 0,e=arr.length-1;
        if (arr[min]==t){
            return min;
        }
        if (BinarySearch(arr,t,s,min-1)!=-1){
            return BinarySearch(arr,t,s,min-1);
        }else if (BinarySearch(arr,t,min+1,e)!=-1){
            return BinarySearch(arr,t,min+1,e);
        }
        return -1;


    }
    public static boolean isSorted(int[] arr){
        return arr[0]<arr[arr.length-1];
    }
    public static int BinarySearch(int[] arr,int target,int s,int e){
//        int s = 0;
//        int e = arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;//reduce overflow when arr is very large(int)
            if (arr[mid]<target){
                s = mid+1;
            }else if (arr[mid]>target){
                e = mid-1;
            }else if (arr[mid]==target){

                return mid;
            }
        }
        return -1;
    }
    public static int Rotatedcount(int[] arr){

        int start = 0;
        int end = arr.length-1;
        if (isSorted(arr)){
            return 0;
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            int next = (mid+1)%arr.length;
            int prev = (mid+ arr.length-1)%arr.length;
            if (arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                return mid;
            }
            if (arr[0]<=arr[mid]){
                start = mid+1;
            }else if (arr[mid]<=arr[arr.length-1]){
                end = mid-1;
            }
        }
        return -1;
    }
}
