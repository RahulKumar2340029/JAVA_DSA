package cp;

import java.util.Scanner;
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
public class substringcheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Pair ans = count(s);
        if (ans.first>ans.second){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }

    }
    public static Pair count(String s){
        int count0=0;
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                count1++;
            }else{
                count0++;
            }
        }
        return new Pair(count0,count1);
    }
}
