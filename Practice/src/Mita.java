import java.util.ArrayList;
import java.util.Arrays;

public class Mita {
    public static void main(String[] args) {
        System.out.println("Asmita");
        System.out.println(sum(2,3));
        int[] test_arr = {2,9,8,7,6,5};
//        System.out.println(Arrays.binarySearch(test_arr,3));
        Arrays.fill(test_arr,5);
        int[]arr = Arrays.copyOfRange(test_arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int sum(int a, int b){
        return a+b;
    }

}
