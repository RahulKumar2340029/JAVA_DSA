package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class beautifulmatrix {
    public static void main(String[] args) {
//        System.out.println(getEncryptedString("dart",3));
//        List<String> ans = validStrings(4);
//        ans.forEach(ele-> System.out.println(ele+" "));
        System.out.println(numberOfSubmatrices(new char[][]{{'X', 'X', '.'}, {'Y', '.', 'Y'}}));
    }

    /*Leetcode weekly 405*/
//    public static String getEncryptedString(String s, int k) {
//        String final_string = s+s;
//        StringBuilder s1 = new StringBuilder(s);
//        for(int i=0;i<s.length();++i){
//            s1.insert(i,final_string.charAt(i+k));
//        }
//
//    }
    /*------------------------------------------------------problem b-------------------------------------------------------*/
//    public static List<String> validStrings(int n) {
//        List<String> result = new ArrayList<>();
//        if(n == 1){
//            result.add("0");
//            result.add("1");
//            return result;
//        }else{
//            f(n,"",result);
//        }
//        return result;
//    }
//    public static void f(int n,String current,List<String> result){
//        if (current.length() == n){
//            result.add(current);
//            return;
//        }
//
//        if(isValid(current+"0")){
//            f(n,current+"0",result);
//        }
//
//        if(isValid(current+"1")){
//            f(n,current+"1",result);
//        }
//    }
//    public static boolean isValid(String curr){
//        for(int i=0;i<curr.length()-1;++i){
//            if(curr.charAt(i)=='0' && curr.charAt(i+1)=='0'){
//                return false;
//            }
//        }
//        return true;
//    }
    /*-------------------------------------------------problem c--------------------------------------------------------*/
    //https://leetcode.com/contest/weekly-contest-405/problems/count-submatrices-with-equal-frequency-of-x-and-y/description/
    public static int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] x = new int[m][n];
        int[][] y = new int[m][n];
        x[0][0] = grid[0][0] == 'X' ? 1 : 0;
        y[0][0] = grid[0][0] == 'Y' ? 1 : 0;

        for (int j = 1; j < n; j++) {
            x[0][j] = grid[0][j] == 'X' ? 1 + x[0][j - 1] : x[0][j - 1];
            y[0][j] = grid[0][j] == 'Y' ? 1 + y[0][j - 1] : y[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            x[i][0] = grid[i][0] == 'X' ? 1 + x[i - 1][0] : x[i - 1][0];
            y[i][0] = grid[i][0] == 'Y' ? 1 + y[i - 1][0] : y[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                x[i][j] = grid[i][j] == 'X' ? 1 + x[i - 1][j] + x[i][j - 1] - x[i - 1][j - 1] : x[i - 1][j] + x[i][j - 1] - x[i - 1][j - 1];
                y[i][j] = grid[i][j] == 'Y' ? 1 + y[i - 1][j] + y[i][j - 1] - y[i - 1][j - 1] : y[i - 1][j] + y[i][j - 1] - y[i - 1][j - 1];
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][j] >= 1 && x[i][j] == y[i][j]) {
                    System.out.print("row: "+i+"col: "+j);
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(x));
        System.out.println(Arrays.deepToString(y));
        return count;

        /* presum for both X and Y
            | X | X | . |
            | Y | . | Y |
            =============
            for X = | 1 | 2 | 2 |  for Y = | 0 | 0 | 0 |
                    | 1 | 2 | 2 |          | 1 | 1 | 2 |
                    since both are equal only at index / indices : (1,0) , (1,2)

         */

//
//        return 0;
    }
    }
    /*------------------------------------------------problem d ------------------------------------------------------------------------------------*/
//    public static int minimumCost(String target, String[] words, int[] costs) {
//        int n = target.length();
//        int m = words.length;
//
//        // dp array to store minimum cost to form target[0...i]
//        int[] dp = new int[n];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//
//        // Initialize dp[0]
//        for (int i = 0; i < m; i++) {
//            if (words[i].startsWith(String.valueOf(target.charAt(0)))) {
//                dp[0] = Math.min(dp[0], costs[i]);
//            }
//        }
//
//        // Build dp array
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int len = words[j].length();
//                if (i >= len && dp[i - len] != Integer.MAX_VALUE && target.substring(i - len + 1, i + 1).equals(words[j])) {
//                    dp[i] = Math.min(dp[i], dp[i - len] + costs[j]);
//                }
//            }
//        }
//
//        // Check if forming the entire target is possible
//        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
//    }
//}
