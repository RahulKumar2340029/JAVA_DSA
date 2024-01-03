package SDEstriver;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBsc {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4 };
        int[] b = {2,-3,4,-4,-5,11,-12};
//        System.out.println(largest_in_array(arr));
//        System.out.println(second_largest_brute(arr));
//        System.out.println(isSorted(arr));
//        System.out.println(Arrays.toString(remove_duplicates(arr)));
//        rotate_by_one(arr);
//        set_zeroes(arr);
//        System.out.println(linear_search(arr,2));
//        System.out.println(max_consequtive_one(arr));
//        System.out.println(appears_once(arr));
//        System.out.println(missing_number(arr));
//        System.out.println(Arrays.toString(sum_exist_or_not(arr,9)));

//        System.out.println(Arrays.toString(sort_better(arr)));
//        System.out.println(occurs_more_than_nby2(arr));
//        System.out.println(Arrays.toString(rearranging(b)));
//        System.out.println(Arrays.toString(leader_in_array(arr)));
//        System.out.println(longest(arr));
        System.out.println(number_of_subarray(arr,6));
    }
//    no of subarray sum
    public static int number_of_subarray(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum =0;
                for (int k = i; k <=j ; k++) {
                    sum+=arr[k];
                }
                if (sum==target){
                    count++;
                }
            }
        }
        return count;
    }

//    longest consequtive seq
    public static int longest(int[] arr){
        Arrays.sort(arr);int count=1;int max=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]+1){
                count++;

            }else{
                max = Math.max(max,count);
                count=1;
//                continue;
            }
        }
        return Math.max(max,count);
    }
//    Leaders in an array
    public static int[] leader_in_array(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();int count=0;
        for (int i = 0; i < arr.length; i++) {
                    count=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>=arr[j]){
                    count++;
                }
                if (count==arr.length-i-1){
                    ans.add(arr[i]);
                }
            }
        }
        ans.add(arr[arr.length-1]);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
//   Rearranging acc to sign
    public static int[] rearranging(int[] arr){
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                p.add(arr[i]);
            }else{
                n.add(arr[i]);
            }
        }
        int[] result = new int[arr.length];
        int i=0;
        while(i<result.length){
            if (!p.isEmpty()){
                result[i++] = p.remove(0);
            }
            if (!n.isEmpty()){
                result[i++] = n.remove(0);
            }
        }
        return result;
    }
//   majority element that occurs more than times N/2
    public static int occurs_more_than_nby2(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>arr.length/2){
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    
//    sort 0s,1s,2s
    public static int[] sort_better(int[] arr){
        int count0=0,count1=0,count2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i]=0;
        }
        for (int i = count0; i < count1+count0; i++) {
            arr[i]=1;
        }
        for (int i = count1+count0; i < count0+count1+count2; i++) {
            arr[i]=2;
        }
        return arr;
    }
//    check if sum of pair exist or not
    public static int[] sum_exist_or_not(int[] arr,int target){
        int sum=0;ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];int complement = target-a;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==complement){
                    ans.add(i);ans.add(j);
                    return ans.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return new int[]{-1,-1};
    }
//    missing number in an array 1 to N
    public static int missing_number(int[] arr){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum2+=arr[i];
        }
        return sum-sum2;
    }

//    no appears once{optimal }
    public static int appears_once(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
//    Max consequtive one
    public static int max_consequtive_one(int[] arr){
        int max=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
                if (max<count){
                    max = count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
//    Union
    public static int[] union_of_arr(int[] a,int[] b){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            ans.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (!ans.contains(b[i])){
                ans.add(b[i]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
//    Linear search
    public static int linear_search(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== target){
                return i;
            }
        }
        return -1;
    }
//    setzeroes at the end
    public static void set_zeroes(int[] arr){
//        int count=0;
        ArrayList<Integer> ans= new ArrayList<>();
//        count no of zeroes

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] ==0)){
                ans.add(arr[i]);
            }
        }
        for (int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        for (int i = ans.size(); i <arr.length ; i++) {
            arr[i] = 0;
        }

//        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
//    left rotate by k places
    public static void rotate_by_k(int[] arr,int k,boolean left){
        int k1 = k%arr.length;

    }
//    prob rotate array by one
    public static void rotate_by_one(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

    }
//    prob = remove duplicates element already sorted
    public static int[] remove_duplicates(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (!ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
//    issorted
    public static boolean isSorted(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

//    prob2 bruteforce
    public static int second_largest_brute(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static int largest_in_array(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int Largest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
