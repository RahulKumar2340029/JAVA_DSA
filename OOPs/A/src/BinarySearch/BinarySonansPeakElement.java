package BinarySearch;
//for unsorted array Binary search on ans
public class BinarySonansPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,25};
        System.out.println(PeakElement(arr));
    }
    public static int PeakElement(int[] arr){
        int s=0;int e = arr.length-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (m==0){
                if (arr[m]>arr[m+1]){
                    return m;
                }else if (arr[m]<arr[m+1]){
                    return m+1;//how it is different from s = m+1;
                }
            }else if (m==arr.length-1){
                if (arr[m]>arr[m-1]){
                    return m;
                }else if (arr[m]<arr[m-1]){
                    return m-1;//how it is different from e = m-1
                }
            }
            if (m>0 && m<arr.length-1){
                if (arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                    return m;
                }else if (arr[m-1]>arr[m+1]){
                    e = m-1;
                }else if (arr[m+1]>arr[m-1]){
                    s = m+1;
                }
            }
        }
        return -1;
    }
}
