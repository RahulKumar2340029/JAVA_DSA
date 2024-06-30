package BinarySearch;

public class L11NextAlphabet {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','h'};
        System.out.println(NextAlphabetOf(arr,'i'));
    }
    public static char NextAlphabetOf(char[] arr,char target){
        //same as ceil of a number
        int s = 0;
        int e = arr.length-1;
        int result = -1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (arr[m]==target){
                return arr[m];
            }else if (arr[m]>target){
                result = m;
                e = m-1;
            }else if (arr[m]<target){
                s = m+1;
            }
        }
        if (result!=-1){
            return arr[result];
        }
        return '0';
    }
}
