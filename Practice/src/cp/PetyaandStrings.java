package cp;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        int i=0;
        for (int ele:s.toCharArray()){
            if (ele!=s2.charAt(i)){
                if (ele-'0'>s2.charAt(i)-'0'){
                    System.out.println(1);
                }else if (ele-'0'==s2.charAt(i)-'0'){
                    System.out.println(0);
                }else{
                    System.out.println(-1);
                }
            }
            i++;
        }

    }
}
