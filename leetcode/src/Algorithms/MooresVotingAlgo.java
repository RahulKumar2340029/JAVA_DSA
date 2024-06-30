package Algorithms;

public class MooresVotingAlgo {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,0,0,1,1,1,1};
        System.out.println(majority_ele(arr));
    }

    public static int majority_ele(int[] arr){
        int cnt=0;int ele=0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt==0){
                ele = arr[i];
                cnt = 1;
            }else if (ele == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        cnt=0;
        for(int x:arr){
            if (x==ele){
                cnt++;
            }
        }
        if (cnt>arr.length/2){
            return ele;
        }
        return -1;
    }
}
