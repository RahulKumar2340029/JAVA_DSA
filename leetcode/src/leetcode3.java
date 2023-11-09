import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
//        System.out.println(Arrays.toString(minmax(arr)));
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};
//        System.out.println(findInMountainArray(101,arr3));
//        System.out.println(arr3.length);
        int[] b = {2,1,6,2};
        System.out.println(SelfDividingNumbers(11,22));

//        printriangle(arr);
//        System.out.println(intersection(arr,b));
//        System.out.println(Arrays.toString(intersection(arr,b)));
//        System.out.println(unique(arr));
//        System.out.println(maxProfit(arr));

    }
    public static List<Integer> SelfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDiv(i)==true){
                list.add(i);
            }

        }
        return list;
    }
    public static boolean isSelfDiv(int n){
        if(n/10==0) return true;
        while(n>0){
            int ld = n%10;
                if(ld==0){
                    return false;
                }

                if(n/ld==0){
                    return true;
                }
                n/=10;


        }
        return false;

    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int index;
        int[] a = Arrays.copyOf(mountainArr,mountainArr.length);
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;

            }
        }
        return -1;
    }
//    public static int findInMountainArray(int target, int[] mountainArr) {
//        int index;
//        if(search(mountainArr,target)==false){
//            return -1;
//        }
//        for(int i=0;i<mountainArr.length;i++){
//            if(mountainArr[i]==target){
//                return i;
//
//            }
//        }
//        return 0;
//    }
//    public static boolean search(int[] a,int target){
//        for(int i=0;i<a.length;i++){
//            if(a[i]==target){
//                return true;
//            }
//        }
//        return false;
//    }
    public static int[] minmax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return new int[]{min,max};
    }
    public static void printriangle(int[] arr){
        if (arr.length<1) return;
        int[] temp = new int[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {
            int sum = arr[i]+arr[i+1];
            temp[i] = sum;
        }
        printriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static int maxProfit(int[] arr) {
        int min = 0;int max = Integer.MIN_VALUE;int count=0;
        if(arr.length==1) return 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count==arr.length-1) return 0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<arr[min]){
                min = i;
            }
        }
        for (int i = min+1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return (max-arr[min]);
    }
    public static int unique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        int count=1;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
                if (count==2) return arr[i];

        }
        return -1;
    }
}
