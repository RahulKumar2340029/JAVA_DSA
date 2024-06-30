package cp;

import java.util.Scanner;

public class binaryexp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(powit(a , b));
    }
//    method 1 recursive

    public static long pow(long a, long b){
        if (b==0) return 1;
        long result = pow(a,b/2);
        if((b&1)==1){
            return a * result * result;
        }else{
            return result * result;
        }
    }
//    method 2 iterative
    public static long powit(long a, long b){
        long ans = 1;
        while (b>0){
            if ((b&1)==1){
                ans = ans * a;
            }
            a = a * a;
            b>>=1;//b = b>>1 right shift b
        }
        return ans;
    }
}
