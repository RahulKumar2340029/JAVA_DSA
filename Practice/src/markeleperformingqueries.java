import java.util.ArrayList;
import java.util.Arrays;

public class markeleperformingqueries {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,2,3,1};
        int[][] queries = {{1,2},{3,3},{4,2}};
        System.out.println(Arrays.toString(unmarkedSumArray(nums,queries)));
    }
    public static int[] unmarkedSumArray(int[] nums, int[][] queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int ele : nums) {
            arr.add(ele);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int k = queries[i][1];
            if (!arr.contains(nums[index])) {
                arr.add(nums[index]);
            }
            int count = 0;
            int sum = 0;
            while (count < k) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < arr.size(); j++) {
                    min = Math.min(min, arr.get(j));
                }
                if (arr.contains(min)) {
                    arr.remove((Integer) min);
                    sum += min;
                    count++;
                } else {
                    break;
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
