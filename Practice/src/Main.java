import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3}};
        int[][] b = {{1,0},{0,1}};
//        System.out.println(Arrays.deepToString(matrixmul(arr,b,2,2,2)));
//        System.out.println(Arrays.deepToString(matrixmul(arr,b,2,2)));
        ArrayList ans = new ArrayList(12);
        System.out.println(ans);
    }
//    public static int[][] matrixmul(int[][] a,int[][] b,int aLen,int bLen,int cLen){
//
//        int[][] ans = new int[aLen][cLen];
//        for (int i = 0; i < aLen; i++) {
//            for (int j = 0; j <bLen ; j++) {
//            int sum=0;
//                for (int k = 0; k < cLen; k++) {
//
//                sum+=a[i][k]*b[k][j];
//                ans[i][j] = sum;
//                }
//            }
//        }
//        return ans;
//
//    }
}