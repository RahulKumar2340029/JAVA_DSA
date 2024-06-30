package BinarySearch;

public class LCeil {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19,20};
        System.out.println(floor(arr,5));
    }
    public static int floor(int[]arr,int n){
        int s=0;int e=arr.length;int result = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==n){
                return m;

            }else if(arr[m]<n){
                result = m;
                s = m+1;
            }else if(arr[m]>n){
                e = m-1;
            }
        }
        return result;
    }
    public static int ceilingOf(int[] arr,float t){
        int s=0;int e = arr.length-1;
        int result  =-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (arr[m]==t){
                return arr[m];
            }else if (arr[m]>t){
                result = m;
                e = m-1;
            }else if (arr[m]<t){
                s = m+1;
            }
        }
        if (result!=-1){
            return arr[result];
        }
        return -1;
    }
}
