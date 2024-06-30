package BinarySearch;
//very very important
public class L13FirstOccurrenceOfOneInfSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,1};
        System.out.println(FirstInfOne(arr));
    }
    public static int FirstInfOne(int[]arr){
        int s=0;int e=1;
        int result=-1;
        while (e < arr.length && arr[e]<=1){
            s = e;
            e = 2*e;

        }
        if (s < arr.length) {
            result = FirstOccurence(arr, 1);
        }
        return result;
    }
    public static int FirstOccurence(int[] arr,int t){
        int s=0;int e = arr.length-1;
        int result1 = -1;
        while (s<=e){
            int m =s+(e-s)/2;
            if (arr[m]==t){
                result1 = m;
                e = m-1;
            }else if (arr[m]<t){
                s = m+1;
            }else if (arr[m]>t){
                e = m-1;
            }
        }
        return result1;
    }
}
