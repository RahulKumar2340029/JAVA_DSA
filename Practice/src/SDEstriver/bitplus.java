package SDEstriver;

import java.util.Scanner;

public class bitplus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();int x = 0;
        in.nextLine();
        for(int i=0;i<t;i++){
            String s = in.nextLine();
            if(s.contains("++")){
                x++;
            }else{
                x--;
            }

        }
        System.out.println(x);
    }
}
