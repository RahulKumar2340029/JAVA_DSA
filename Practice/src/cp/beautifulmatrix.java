package cp;

import java.util.Scanner;

public class beautifulmatrix {
    public static void main(String[] args) {
        int row=0,col=0;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i = 0; i <5 ; i++){
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j]==1){
                    row=i;col=j;
                }
            }
        }
        int cnt=0;
        while(row!=2){
            cnt++;
            if(row<2){
                row++;
            }else{
                row--;
            }
        }
        while(col!=2){
            cnt++;
            if(col<2){
                col++;
            }else{
                col--;
            }
        }
        System.out.println(cnt);
    }
}
