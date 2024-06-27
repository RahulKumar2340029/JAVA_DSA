package cp;

import java.util.*;

public class Boys_and_Girls {

    static final int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int[] dp = new int[1 << 3];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; ++i) {
            int pr = scanner.nextInt();
            String vitamin = scanner.next();

            int b = 0;
            for (char ch : vitamin.toCharArray()) {
                if (ch == 'A') {
                    b |= 1;
                } else if (ch == 'B') {
                    b |= 2;
                } else if (ch == 'C') {
                    b |= 4;
                }

                dp[b] = Math.min(dp[b], pr);
            }
        }

            for (int i = 0; i < 8; ++i) {
                for (int j = i; j > 0; j = (j - 1) & i) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i ^ j]);
                }
            }

            if (dp[7] == INF) {
                System.out.println(-1);
            } else {
                System.out.println(dp[7]);
            }
        }
    }


