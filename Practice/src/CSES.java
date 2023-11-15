import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CSES {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        weirdNumber(n);
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
}
