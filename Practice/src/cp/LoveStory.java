package cp;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String original = "codeforces";
        while (t>0){
            int cnt = 0;
            String s = in.next();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)!=original.charAt(i)) cnt++;
            }
            System.out.println(cnt);
            t--;
        }

    }
}
