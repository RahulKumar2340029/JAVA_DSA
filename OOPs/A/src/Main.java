public class Main {
    public static void main(String[] args) {
//        System.out.println(maxProduct(new int[]{-2,0,-1}));
        System.out.println(ternarySearch(new int[]{1,2,3,9,10,12,15,17,18},17));
    }
//    static int maxProduct(int[] arr){
//        int p = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            int prod = arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                prod = prod*arr[j];
//                p = Math.max(p,prod);
//            }
//        }
//        return p;
//    }
    static int ternarySearch(int[] arr, int x){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int left_mid = s+(e-s)/3;
            int right_mid = e-(e-s)/3;

            if (arr[left_mid]==x){
                return left_mid;
            } else if (arr[right_mid]==x) {
                return right_mid;
            }else if (arr[left_mid]>x){
                e = left_mid-1;
            }else if (arr[left_mid]<x){
                s = left_mid+1;
            }else {
                s = left_mid + 1; e = right_mid - 1;
            }
        }
        return -1;
    }


}
