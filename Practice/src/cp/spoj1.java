package cp;

import java.util.Scanner;

public class spoj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == 42) {
                break;
            }
            System.out.println(num);
        }
        scanner.close();
    }

}
