package StackAV;

public class RainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(RainWaterTrapping(arr));
    }
    public static int RainWaterTrapping(int[] arr){
        int[] maxL = new int[arr.length];
        int[] maxR = new int[arr.length];int sum=0;
        maxL[0] = arr[0];
        maxR[arr.length-1] = arr[arr.length-1];
        for (int i = 1; i <arr.length ; i++) {
            maxL[i] = Integer.max(maxL[i-1],arr[i]);
        }
        for (int i = arr.length-2; i >=0 ; i--) {
            maxR[i] = Integer.max(maxR[i+1],arr[i]);
        }
        int[] waterSize = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            waterSize[i] = Math.max(maxL[i],maxR[i])-arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            if (waterSize[i]>=0){
                sum+=waterSize[i];
            }
//            sum+=waterSize[i];

        }
        return sum;
    }
}
