import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CSES {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        weirdNumber(n);
        int[] arr = {10,9,8,7,6,5};
        primes(1000);
//        System.out.println(valid(arr));
//        System.out.println(peak(arr));
//        System.out.println(minimum(arr));
//        System.out.println(ternary_search( 6,8));
    }
    //valid mountain array
    public static boolean valid(int[] arr){
        boolean flag = false;
        int increment = 0,decrement = 0;
        for(int i=0;i<arr.length-1;++i){
            if(arr[i] < arr[i+1]){
                if(flag) return false;
                increment++;
            }else if(arr[i] == arr[i+1]){
                return false;
            }else{
                flag = true;
                decrement++;
            }
        }
        if (increment == 0 || decrement == 0) return false;
        return true;
    }
    //valid mountain array m2
    public static boolean valid2(int[] arr){
        int count = 0;
        return 0==0;
    }

    //peak in mountain array
    //intuition if slope up region s = mid + 1else if slope down region e = mid -1 ;
    public static int peak(int[] arr){
        int s = 0,e = arr.length-1;
        while(s <=e){
            int mid = (s+e)>>>1;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                e = mid - 1;
            } else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }
    public static int minimum(int[] arr){
        int s = 0,e = arr.length-1;
        while(s<=e){
            int mid1 = s+(e-s)/3;
            int mid2 = e-(e-s)/3;
            if(arr[mid1] > arr[mid2]){
                s = mid1 + 1;
            }else{
                e = mid2 - 1;
            }
        }
        return arr[s];
    }
    public static double ternary_search(double l,double r){
        double epsilon = 1e-9; // A very small value for precision
        int maxIterations = 1000; // Maximum number of iterations
        int iterations = 0; // Current number of iterations
        while (r - l > epsilon && iterations < maxIterations) {
            double m1 = l + (r - l) / 3;
            double m2 = r - (r - l) / 3;
            if (f(m1) < f(m2)) {
                r = m2;
            } else {
                l = m1;
            }
            iterations++;
        }
        return f(l);
    }
    private static double f(double x){
        return 2*x*x - 12*x + 7;
    }
    public static void weirdNumber(long n){
        System.out.print(n + " ");
        Set<Integer> visitedNumbers = new HashSet<>();

        while(n > 1 && !visitedNumbers.contains(n)){
            visitedNumbers.add((int)n);

            if (n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            System.out.print(n + " ");
        }

        System.out.println();
    }
    //sieve of Eratosthenes --> printing primes
    public static void primes(int n){
        boolean[] prime = new boolean[n+1];
        prime[1] = true;
        for(int i = 2;i<prime.length;++i){
            if(!prime[i]){
                for(int j=2*i;j<prime.length;j+=i){
                    prime[j] = true;
                }
            }

        }
        for(int i=2;i<=n;++i){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
