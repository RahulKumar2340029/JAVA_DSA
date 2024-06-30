package BinarySearch;

public class SearchBitonic {
    public static void main(String[] args) {

    }
//    public static int BitonicArray(int[] arr,int target){
//        if (target<arr[PeakElement(arr)]){
//            return BinarySearchasc(arr,target,0,PeakElement(arr)-1);
//        }else if (target>arr[PeakElement(arr)]){
//            return BinarySearchdec(arr,target,PeakElement(arr)+1,arr.length-1);
//        }else if (target==arr[PeakElement(arr)]){
//            return PeakElement(arr);
//        }
//
//    }
    public static int BinarySearchasc(int[] arr,int target,int s,int e){
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
    public static int BinarySearchdec(int[] arr,int target,int s,int e){
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
