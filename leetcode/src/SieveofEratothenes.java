import java.util.Arrays;

public class SieveofEratothenes {
    public static void main(String[] args) {
        System.out.println(primeSieve(100));
    }
    public static int primeSieve(int n){
        long[] primes = new long[1000000*5];
        Arrays.fill(primes,1);
        int count=0;
        for (int i = 2; i <=n ; i++) {
            if (primes[i]==1){
                for (int j=i*i;j<=n;j+=i){
                    primes[j]=0;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (primes[i]==1){
                count++;
                System.out.print(i+",");
            }
        }
        System.out.println();
        System.out.print("No of Primes: ");
        return count;
    }
}
