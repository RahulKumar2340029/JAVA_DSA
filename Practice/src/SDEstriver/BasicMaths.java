package SDEstriver;

public class BasicMaths {
    public static void main(String[] args) {
//        System.out.println(countN(123456));
//        System.out.println(GCD2(3,8));
        System.out.println(isPrime(23));
//        alldivisors(36);
//        int[] arr = {0,1,153,370,371,407,1634};
//        for(int ele: arr){
//            System.out.print(isArmstrong(ele)+" ");
//        }
    }

//    prime numbers
    public static boolean isPrime(int n){
        for (int i = 2; i*i <=n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void alldivisors(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isArmstrong(int n){
        int original = n;
        int t = countN(n),sum=0;
        while (n!=0){
            int ld = n%10;
            sum = sum+(int)Math.pow(ld,t);
            n/=10;
        }
        return original==sum;

    }
//    GCD via Eucleadian algo------------------VERY IMP ALGORITHM 1
    public static int GCD2(int a,int b){
        if (b==0){
            return a;
        }
        return GCD2(b,a%b);
    }
    public static int GCD(int a, int b){
        int hcf = 1;
        for (int i = 2; i <=Math.min(a,b) ; i++) {
            if (a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
    public static boolean isPalindrome(int n){
        return reverse(n)==n;
    }

    public static int reverse(int n){
//        int result;
        int sum=0;
        while (n!=0){
            int ld = n%10;
            sum = ld+sum*10;
            n/=10;
        }
        return sum;

    }
    public static int countN(int n){
        int count=0;
        while(n!=0){
            count++;
            int ld = n%10;
            n/=10;
        }
        return count;
    }
}
