package cp;

import java.util.Arrays;
import java.util.Scanner;
//runtime error
public class helpmaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] num = new int[(s.length()/2) +1];
        char[] symbol = new char[(s.length()/2)];
        int k=0,l=0;
        for (char ele:s.toCharArray()){
            if(ele-'0'>=0 && ele-'0'<=9){
                num[k++] = ele-'0';
            }else{
                symbol[l++] = ele;
            }
        }
//        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            ans.append(num[i]);
            if (i < symbol.length) {
                ans.append(symbol[i]);
            }
        }
        System.out.println(ans);
    }

}
