package cp;

import java.util.Scanner;

public class primegenerator {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        long a,b;
        int t = in.nextInt();
        while (t!=0){
            a = in.nextLong();
            b = in.nextLong();
            for (long i=a;i<=b;i++){
                if (prime(i)){
                    System.out.println(i+" ");
                }
            }
            System.out.println();
            t--;

        }
    }
    public static boolean prime(long a){
        if (a<2) return false;
        if (a==2) return true;
        for (long i=2;i<=Math.sqrt(a);i++){
            if (a%i==0) return false;
        }
        return true;
    }
}
