package BinarySearch;

public class L8NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {5,10,15,30,20,60};
        System.out.println(searchinNearlySortedArray(arr,20));
    }
    public static int searchinNearlySortedArray(int[] arr,int t){
        int s=0;int e = arr.length-1;
        while (s<=e){

            int m = s+(e-s)/2;
            if (m==0 || m==arr.length-1){
                return -1;
            }
            if (arr[m]==t){
                return m;
            }else if (m-1>=s && arr[m-1]==t){
                return m-1;
            }else if (m+1<=e && arr[m+1]==t){
                return m+1;
            }else if (arr[m]<t){
               s = m+2;
            }else if (arr[m]>t){
                e = m-2;
            }
        }
        return -1;
    }
}
