
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int[] a = {3,3,5,5};
        int[] b = {7,7};
        System.out.println(minimumAddedInteger(a,b));

    }

    public static int minimumAddedInteger(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);Arrays.sort(nums2);
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0;i<nums1.length-1;++i){
           for(int j=i+1;j<nums1.length;++j){
               int a = nums1[i];
               int b = nums1[j];
               if(nums2[0] - a == nums2[1] - b){
                   int ans = nums2[0] -a;
                   min = Math.min(ans,min);
                   count++;

               }
               if(count==3) break;
           }

        }
        return min;
    }
}
