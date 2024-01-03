package SDEstriver;

import java.util.Arrays;

public class BasicRec {
    public static void main(String[] args) {
//        Print(5);
//        Printname(5);
        int[] arr = {1,2,3,4,5};
        reversearray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(factorial(3));
        System.out.println(isPalindrome("harah"));
        System.out.println(fibonacci(5));
        printfib(6);
    }
//    prob9---fib upto n{step1 find fibonacci ; step2 sout
    public static void printfib(int n){
        for (int i=0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

//    prob8---check if a string is palindrome of not
    public static boolean isPalindrome(String str){
        int s=0,e=str.length()-1;
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        if (s>=e) return true;
        return isPalindrome(str.substring(s+1,e));
    }
//    prob7---reverse an array
    public static void reversearray(int[] arr,int s,int e){
        if (s==e || s>e){
            return;
        }
        int temp = arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
        reversearray(arr,s+1,e-1);
    }
//prob6---Factorial of n numbers
    public static int factorial(int n){
        if (n==1) return n;
        return n*factorial(n-1);
    }
//    prob5
    public static int sum(int n){
        if (n==0) return n;
        return n+sum(n-1);
    }
    //prob2--Print name n times
    public static void Printname(int n){
        if (n==0) return;
        System.out.println("Rahul");
        Printname(n-1);
    }

//    prob1,3,4
    public static void Print(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n);//place below for increasing order
        Print(n-1);
    }
}
