package cp;

import java.util.Scanner;

import java.util.Scanner;

public class waytoolongwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        // Consume the newline character after reading the integer
        in.nextLine();

        while (t > 0) {
            String s = in.nextLine();
            if (s.length() <= 10) {
                // If the word length is less than or equal to 10, output the word as is
                System.out.println(s);
            } else {
                // If the word length is greater than 10, abbreviate it
                System.out.println(s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1));
            }
            t--;
        }
        in.close();
    }

}
