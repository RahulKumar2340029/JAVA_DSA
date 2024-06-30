package cp;

import java.util.Scanner;

public class Luckynumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long a = in.nextLong();
//        long b = a;
//        //length of a;
//        int count = 0,lucky=0;
//        while (b!=0) {
//            long ld = b%10;
//            if (ld==4 || ld==7){
//                lucky++;
//            }
//            b /= 10;
//            count++;
//        }
//        if (lucky==4 || lucky==7){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
        System.out.println(divisor(100000));

    }
    public static int divisor(int n){
        int count = 2;
        System.out.println(1);
        for (int i=2;i<n;i++){
            if (n%i==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(n);
        return count;
    }

}
