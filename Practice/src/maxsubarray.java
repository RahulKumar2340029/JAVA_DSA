public class maxsubarray {
    public static void main(String[] args) {
        int[] n = {0,0,1,0,0,0,1,1};
        System.out.println(max(n));
    }
    public static int max(int[] arr){
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (zeroone(arr, i, j)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
    public static boolean zeroone(int[]arr,int i,int j){
        int c0=0,c1=0;
        for (int k=i;k<=j;k++){
            if (arr[k]==0) c0++;
            else c1++;
        }
        return c0==c1;
    }
}
