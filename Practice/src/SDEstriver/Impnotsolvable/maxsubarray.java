package SDEstriver.Impnotsolvable;

public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        System.out.println(maxSubArr(arr,3));
    }
    static int maxSubArr(int[] arr,int k){
        int sum=0;int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
//            sum = arr[i];
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int l = i; l <=j; l++) {
                    sum+=arr[l];
                    if (sum==k){
                        max = Math.max(max,l-i+1);
                    }
                }
            }
        }
        return max;
    }

//    static int maxSubArr(int[] arr,int k){
//        int i=0,j=0,sum=0,max = Integer.MIN_VALUE;
//        while (j<arr.length){
//            sum=sum+arr[j];
//            if (sum==k){
//                max = Math.max(max,j-i+1);
//                i++;j++;
//            }else if (sum<k){
//                j++;
//            }else{
//                sum=sum-arr[i]-arr[j];
//                i++;
//            }
//        }
//        return max;
//    }
}
