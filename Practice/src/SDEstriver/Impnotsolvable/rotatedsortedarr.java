package SDEstriver.Impnotsolvable;

public class rotatedsortedarr {
    public static void main(String[] args) {

    }
    public static boolean searchInARotatedSortedArrayII(int []arr, int val) {
        // Write your code here.
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) >>> 1;
            if (val == arr[mid]) {
                return true;
            }
            if (arr[s] <= arr[mid]) {
                //left array is sorted
                if (arr[s] <= val && val <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            if (arr[mid] <= arr[e]) {
                if (arr[mid] <= val && val <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
            return false;
    }
}
