package cp;

import java.util.*;

public class WrongSubs {
    public static void main(String[] args) {
        List<Integer> ans = countOfPeaks(new int[]{4,1,4,2,1,5},new int[][]{{2,2,4},{1,0,2},{1,0,4}});
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
    public static List<Integer> countOfPeaks(int[] nums, int[][] queries) {
//        [2,index,r] index -> r
//        [1,l,r] peak from l to r
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<queries.length;++i){
            int query = queries[i][0];
            if (query==2){
                nums[queries[i][1]] = queries[i][2];
            }else{
                int ans = peak(queries[i][1],queries[i][2],nums);
                list.add(ans);
            }
        }
        return list;


    }
    public static int peak(int l,int r,int[] nums){
        int left = l, right = r;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if ((mid == l || nums[mid] > nums[mid - 1]) && (mid == r || nums[mid] > nums[mid + 1])) {
                return mid; // Found peak index
            } else if (mid < r && nums[mid] < nums[mid + 1]) {
                // If nums[mid] < nums[mid+1], peak is in the right half
                left = mid + 1;
            } else {
                // Otherwise, peak is in the left half
                right = mid - 1;
            }
        }


        return 0;
    }




































    public static long countCompleteDayPairs(int[] hours) {
        long count = 0;
        for(int i=0;i<hours.length;++i){
            for(int j=i;j<hours.length;++j){
                if((hours[i] + hours[j])%24==0){
                    count++;

                }
            }
        }
        return count;
    }
    public static int findWinningPlayer(int[] skills, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int n = skills.length;
        for(int num : skills) deque.add(num);
        int a = deque.pollFirst();
        int count = 0;
        while(true) {
            int b = deque.pollFirst();
            if (skills[a] > skills[b]){
                deque.addLast(b);
                count++;
            }else if(skills[a]<skills[b]){
                deque.addLast(a);
                deque.addFirst(b);
                a = b;
                count = 1;
            }
            if(count==k){
                return a;
            }

        }
    }
}
