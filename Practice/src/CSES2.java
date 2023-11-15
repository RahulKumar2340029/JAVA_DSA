import java.util.Scanner;

import java.util.Scanner;

public class CSES2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        missingNumber(n, in);
    }

    public static void missingNumber(long n, Scanner in) {
        long[] arr = new long[(int)n - 1];

        for (long i = 0; i < n - 1; i++) {
            if (in.hasNextInt()) {
                arr[(int)i] = in.nextLong();
            } else {
                // Handle the case where there are not enough integers in the input
                System.err.println("Not enough integers provided.");
                return;
            }
        }
        for (long i = 1; i < n; i++) {
            if (!found(arr, i)) {
                System.out.println(i);
                return; // Once you find and print the missing number, exit the loop
            }
        }
    }

    public static boolean found(long[] arr, long target) {
        for (long i = 0; i < arr.length; i++) {
            if (arr[(int)i] == target) {
                return true;
            }
        }
        return false;
    }
}
