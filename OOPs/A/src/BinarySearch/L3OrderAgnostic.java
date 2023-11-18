package BinarySearch;

public class L3OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {20,17,15,14,13,12,10,9,8,4};
        int[]arr2 = {1,2,3,4,5,6,7,8,9,11};
        System.out.println(orderAgnosticSearch(arr2,4));
    }
    public static int orderAgnosticSearch(int[] arr,int target){
        if (arr.length==1){
            return BinarySearch(arr,target);
        }else if (arr[0]<arr[arr.length-1]){
            return BinarySearch(arr,target);
        }else if (arr[0]>arr[arr.length-1]){
           return BinarySearchII(arr,target);
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
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
    public static int BinarySearchII(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;//reduce overflow when arr is very large(int)
            if (arr[mid]<target){
                e = mid-1;
            }else if (arr[mid]>target){
                s = mid+1;
            }else if (arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
