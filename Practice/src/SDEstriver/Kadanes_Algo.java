package SDEstriver;

public class Kadanes_Algo {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

//    Applications:
//
//Stock Trading: Finding the maximum profit within a stock price time series.
//Image Processing: Identifying the largest contiguous region of pixels with specific properties.
//Signal Processing: Analyzing signal segments for maximum power or energy.
//General Array Problems: Solving various array-related problems involving maximum sums or contiguous sequences.
    //print max subarray
//    stock prices -----Bard help
public static int maxProfit(int[] prices) {
    int minPrice = prices[0];  // Initialize to the first price
    int maxProfit = 0;

    for (int price : prices) {
        minPrice = Math.min(minPrice, price);  // Track the minimum price

        // If a price higher than the minimum is found, update profit
        if (price > minPrice) {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
    }

    return maxProfit;
}

    public static int Kadanes_Algorithm(int[] arr){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            current_sum+=arr[i];
            if (current_sum>max_sum){
                max_sum = current_sum;
            }
            if (current_sum<0){
                current_sum = 0;
            }
        }
        return max_sum;
    }
}
