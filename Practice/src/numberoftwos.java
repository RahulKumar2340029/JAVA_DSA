import java.util.Scanner;

public class numberoftwos {
    //tc = O(n * log(n))
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 2; i <=n ; i++) {
            count+=count(i);
        }
        System.out.println(count);
    }
    static int count(int n){
        int l=0;
        while (n>0){
            int ld = n%10;
            if (ld==2) {
                l++;
            }
            n/=10;
        }
        return l;
    }
}
