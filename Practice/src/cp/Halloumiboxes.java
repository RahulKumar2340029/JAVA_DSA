package cp;

import static SDEstriver.ArraysBsc.isSorted;
import java.util.Scanner;

public class Halloumiboxes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-->0){
            int i = 0;int j = 0;
            int len = in.nextInt();
            String[] arr = new String[len];
            for (int k = 0;k<len;k++){
                arr[k] = in.next();

            }
            boolean flag=true;
            for (int k = 0;k<len;k++){
                if (arr[k]=="B"){
                    flag = false;
                    i = k;
                }
                if (flag==false && arr[k]=="B"){
                    j = k;
                }

            }
            System.out.println(j-i+1);

        }
}
//        while (in.hasNext()) {
//            long n = in.nextLong();
//            int count = Count(n);
//            String sum = "";
//            while (count>1) {
//                count--;
//                int ld = (int) (n % 10);
//                if (ld >= 5) {
//                    ld = 9 - ld;
//                }
//                sum = ld + sum;
//                n /= 10;
//            }
//            if (n==9){
//                sum = n + sum;
//            }else{
//                int ld = (int) (n % 10);
//                if (ld >= 5) {
//                    ld = 9 - ld;
//                }
//                sum = ld + sum;
//            }
//            System.out.println(Long.parseLong(sum));
//        }
//    }
//
//public static int Count(long n){
//        int count = 0;
//        while (n!=0){
//            count++;
//            n/=10;
//        }
//        return count;
//        int[] arr;
//        while (t-->0){
//            int n = in.nextInt();
//            int k = in.nextInt();
//                arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextInt();
//            }
//            if (isSorted(arr) || k>=2){
//                System.out.println("YES");
//            } else{
//                System.out.println("NO");
//            }
//        }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
