package SDEstriver;


import java.util.*;

public class ArraysBsc {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{2},{0},{4}, {4}, {5}, {11}, {12}};
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
//        ans.

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
//        System.out.println(number_of_subarray(arr,6));
//        System.out.println(Arrays.toString(sum3(arr)));
//        System.out.println(XOR_subarray(arr,6));
//        System.out.println(longest_zero_sum(arr));
//        System.out.println(max_prod_subarray(arr));
//        System.out.println(count_inversion(arr));
//        System.out.println(Arrays.toString(repeated_missing(arr)));
//        System.out.println(count_reverse_pairs(arr));
//        System.out.println(Arrays.toString(occurs_more_than_nby3(arr)));
//        rotate(arr,2+1,2+1);
        set_col(b);
        System.out.println(Arrays.deepToString(b));
        System.out.println(isIsomorphic("foo","bar"));
    }
    public static boolean isIsomorphic(String s, String t) {
        Set<Character> ele = new HashSet<>();
        Set<Character> ele2 = new HashSet<>();
        for(int i=0;i<s.length();i++){
            ele.add(s.charAt(i));
        }
        int eleSize = ele.size();
        for(int i=0;i<t.length();i++){
            ele2.add(t.charAt(i));
        }
        int eleSize2 = ele2.size();
        if(eleSize==eleSize2 && s.length()==(t.length())){
            return true;
        }else{
            return false;
        }

    }
//    sl ans ss

//    set matrix zeros brute force
//    static void set(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                set_row(arr);
//
//            }
//        }
//    }
    public static void set_col(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0]==0){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j][0]>0){
                        arr[j][0]=-1;
                    }
                }
                return;
            }
        }
    }
    public static void set_row(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j]>0){
                        arr[j]=-1;
                    }
                }
                return;
            }
        }
    }
//    rotate arr by 90 def  = transpose + reverse
    static void rotate(int[][] arr,int row,int col){
        int[][] transpose = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = row-1; j >=0; j--) {
                arr[i][j] = transpose[i][row-j-1];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
//    cyclic sort
    public static int[] repeated_missing(int[] arr){
        int i=0;
        while (i<arr.length){
            int currIndex = arr[i]-1;
            if (arr[i]!=arr[currIndex]){
                int temp = arr[i];
                arr[i] = arr[currIndex];
                arr[currIndex] = temp;
            }else{
                i++;
            }
        }
        int[] result = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                result[0] = arr[j];
                result[1] = j+1;
                break;
            }
        }
        return result;
    }
//    count inversion
    public static int count_inversion(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
//    merge without using extra space

//    XOR as target
    public static int XOR_subarray(int[] arr,int target){
        int count=0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
            int xor = 0;
                for (int k = i; k <=j ; k++) {
                    xor^=arr[k];
                }

                if (xor==target){
                    count++;
                }
            }
        }
        return count;
    }
//    longest subarray with zero_sum
public static int longest_zero_sum(int[] arr) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = i; j < arr.length; j++) {
            sum += arr[j];
            if (sum == 0) {
                count = j - i + 1;
                max = Math.max(count, max);
            }
        }
        if (arr[i] == 0) {
            // Handle the case where the current element is zero
            max = Math.max(1, max);
        }
    }
    return max;
}

    //    maxproduct subarray
    public static int max_prod_subarray(int[] arr){
        int prod1 = arr[0],result = arr[0],prod2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prod1 = Math.max(arr[i],Math.max(arr[i]*prod1,arr[i]*prod2));
            prod2 = Math.min(arr[i],Math.min(arr[i]*prod1,arr[i]*prod2));
            result = Math.max(result,prod1);
        }
        return result;
    }
//    count reverse pairs
    public static int count_reverse_pairs(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            while (j<arr.length){
                if (arr[i]>2*arr[j]){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
//    Appears more than N/3 times
public static int[] occurs_more_than_nby3(int[] arr) {
//    ArrayList<Integer> ans = new ArrayList<>();
    Set<Integer> ans = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        int count = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
            if (count > arr.length / 3) {
//                if (!ans.contains(arr[i])) {
//                    ans.add(arr[i]);
//                }
                ans.add(arr[i]);

            }
        }

    }
    return ans.stream().mapToInt(Integer::intValue).toArray();
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
            if (!n.isEmpty()){
                result[i++] = n.remove(0);
            }
            if (!p.isEmpty()){
                result[i++] = p.remove(0);
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
//    threesome

//    check if sum of pair exist or not
    public static ArrayList<Integer> sum_exist_or_not(int[] arr,int target){
        int sum=0;ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];int complement = target-a;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==complement){
                    ans.add(i);ans.add(j);
                    return ans;
                }
            }
        }
        return new ArrayList<>();
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
