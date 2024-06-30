import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i <=n ; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <=n/2 ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return flag;
    }
}
