public class BitwiseOp {
    public static void main(String[] args) {
        int a=5<<3;//5*(2*2*2)=5*2^3
        int b=10<<4;//10*(2*2*2*2)
        System.out.println(a+" "+b);
        System.out.println(1>>5);//1/2^5
        System.out.println(~41+1);//2s complement of 41 i.e negative of 41 is 1s complement ~41 ,plus 1
        System.out.println(-1>>>24);//sign extension when u right shift, the top bit exposed by the right shift are filled in
        //with th eprev contents of top bit ********very imps
        System.out.println(5&-1);//-1==11111111...
        //XOR a^1=~a and a^0=a and a^a=0;
        System.out.println(~5);
        System.out.println(5^1);
        int[] arr = {-2,3,2,4,-5,5,-4};
        System.out.println(contains(arr));
        System.out.println(set(34,5));
        System.out.println(reset(50,5));
        System.out.println(neg(10));
        System.out.println(magicno(4));
        System.out.println(DigitsII(15));
        System.out.println(sumofnthpascal(5 ));

    }
    public static int sumofnthpascal(int n){
        return 1<<(n-1); //1*2^(n-1)---by combination formula
    }
    public static int DigitsII(int n){
        int b=2;
        return (int)(Math.log(n)/Math.log(b)+1);
    }
    public static int Digits(int n){
        int count=0;
        while (n>0){
            n = n>>1;
            count++;
        }
        return count;
    }
    public static int magicno(int n){
        int base=5;int ans=0;
        while(n>0){
            int last = n&1;
            n=n>>1;
            ans+=last*base;
            base*=5;
        }
        return ans;
    }
    public static boolean oddeven(int n){
//        return (n&1)==1? false: true;
        return (n&1)==1;
    }
    public static int unique(int[] arr){
        int ans=0;
        for (int elem:arr) {
            ans^=elem;
        }
        return ans;
    }
    public static int contains(int[]arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans+=arr[i];
        }
        return ans;
    }
    public static int ithBit(int n,int i){
        return n&(1<<i-1);
    }
    public static int set(int n,int i){
        return n|(1<<i-1);
    }
    public static int reset(int n,int i){
        return n&(~(1<<i-1));
    }
    public static int neg(int n){
        return (~n);
    }
}
