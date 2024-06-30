import java.util.Arrays;

public class leetcode2 {
    public static void main(String[] args) {
        int[] a = {1,1,0};
        int[] b = {3};
        System.out.println(findMaxConsecutiveOnes(a));
//        System.out.println(Arrays.toString(merge(a,b)));
//        System.out.println(findMedianSortedArrays(a,b));
    }
    public void moveZeroes(int[] nums) {

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1,nums2);
        double median;
        if(ans.length%2==0){
            double temp = (ans[ans.length/2]+ans[(ans.length/2)-1]);
            median = temp/2;
        }else{
            median = (ans[ans.length/2]);
        }
        return median;
    }
    public static int[] merge(int[] nums1,int[] nums2){
        int[] ans = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }else{
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i<nums1.length){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while (j<nums2.length){
            ans[k] = nums2[j];
            k++;
            j++;
        }
        return ans;
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;int i=0;
        for(;i<nums.length;i++){
            while(i<nums.length&&nums[i]==1){
                count++;
                i++;

            }
            if(count>max){
                max=count;
                count=0;
            }
        }

        return max;

    }
    
}
