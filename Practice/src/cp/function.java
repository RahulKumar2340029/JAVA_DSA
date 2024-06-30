package cp;

import java.util.*;

public class function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        System.out.println(scoreOfString("zaz"));
        System.out.println(numberOfSubarrays(new int[]{1,4,3,3,2}));
        System.out.println(findLatestTime( "?1:?6"));
        System.out.println(maximumPrimeDifference(new int[]{47,93}));
        System.out.println(isPrime(93));
        System.out.println(findKthSmallest(new int[]{4,8},55789));
    }
    public static long findKthSmallest(int[] coins, int k) {
        List<Long> allcoins = new ArrayList<>();
        if (coins.length==1){
            return coins[0]*k;
        }
        int n = (int)Math.ceil((double)(k));
        System.out.println(n);

        for (int i = 0; i < coins.length; i++) {
            long count = 0;long m=1;
            while (count<n){
                allcoins.add(coins[i]*m);
                m++;
                count++;
            }

        }
        Collections.sort(allcoins);
        List<Long> newlist = new ArrayList<>();
        for (long ele:allcoins){
            if (!newlist.contains(ele)){
                newlist.add(ele);
            }
        }
        for(long ele:newlist){
            System.out.println(ele);
        }
        return newlist.get(k-1);
//        int f = 0;
//        Set<Integer> set = new HashSet<>();
//        while (!allcoins.isEmpty()){
//            set.add(allcoins.get(f++));
//        }
//      Object[] finalarr = set.toArray();
//        return finalarr[k];

    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static int maximumPrimeDifference(int[] nums) {
        int a=0,b=0;boolean flag1 = false;boolean flag2 = false;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])){
                a = i;
                flag1 = true;
                break;
            }
        }
        for (int i = nums.length-1; i >=0; i--) {
            if (isPrime(nums[i])){
                b = i;
                flag2 = true;
                break;
            }
        }
        if (flag1 && !flag2 || !flag1 && flag2){
            return 0;
        }else if (flag1 && flag2){
            return Math.abs(a-b);
        }else{
            return 0;
        }
    }

    public static int scoreOfString(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'));
        }
        return sum;
    }
    public static int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points);int count = 0;
        for (int i = 0; i < points.length; i++) {
            int j = i + 1;
            boolean flag = false;
            while (j < points.length && points[j][0] - points[i][0]<=w){
                j++;
                flag = true;
            }
            if (flag){

                i = j;
            }
            count++;

        }
        return count;
    }
    public static long numberOfSubarrays(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        long ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            if (freq.get(nums[i])>1){
                int kval = freq.get(nums[i]);
                ans +=nCr(nums[i],kval);

            }
        }
        return ans;
    }
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n)
    {
        if(n==0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    public static String findLatestTime(String s) {
        char[] sArr= s.toCharArray();
        if(sArr[0]=='?'){
            if (sArr[1]=='?' || sArr[1]-'0'<2){
                sArr[0] = '1';
            }else{
                sArr[0] = '0';
            }
        }
        if (sArr[1]=='?'){
            if (sArr[0]=='1'){
                sArr[1] = '1';
            }else{
                sArr[1] = '9';
            }
        }
        if (sArr[3] == '?') {
            sArr[3] = '5';
        }

        if (sArr[4] == '?') {
            sArr[4] = '9';
        }
        return new String(sArr);
    }
}
