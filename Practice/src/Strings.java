import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        int[] happiness = {7,50,3};
        System.out.println(maximumHappinessSum(happiness,3));
    }
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum1 = 0;
        int sum2 = 0;
        for(int ele:apple){
            sum1+=ele;
        }
        for(int ele:capacity){
            sum2+=ele;
        }
        if(sum1==sum2) return capacity.length;
        sum2=0;int count=0;

        for (int i = capacity.length-1 ;i>=0;i--) {
            sum2+=capacity[i];
            count++;
            if(sum1>=sum2){
                return count;
            }

        }
        return -1;
    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        int i,j=happiness.length-1;
        long sum = 0;
        int k1=0;
        Arrays.sort(happiness);
        while(k1<k){
            sum+=happiness[j];
            i = j-1;
            for (int t = j - 1; t >= 0; t--) {
                if (happiness[t] >= 0) {
                    happiness[t]--;
                }
            }

            j--;
            k1++;
        }
        return sum;

    }

}
