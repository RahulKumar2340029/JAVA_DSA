public class leetcode {
    public static void main(String[] args) {
        int[] arr = {10,3,4};
        System.out.println(norotations(arr));
    }
    public static int norotations(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            if (arr[left]<=arr[right]){
                return left;
            }
            int mid = (left+right)/2;
            int prev = (mid+arr.length-1)%arr.length;
            int next = (mid+1)%arr.length;
            if (arr[mid] <= arr[prev] && arr[mid] <=arr[next]){
                return mid;
            }else if (arr[mid]<=arr[next]){
                right = mid-1;
            }else if (arr[mid]>=arr[prev]){
                left = mid+1;
            }
        }
        return -1;
    }

}
