

public class recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(isSorted(arr,0));
//        System.out.println(isPower(5));
//        System.out.println(product(52,23));
//        System.out.println(sumofDigits(2452456));
//        System.out.println(firstUppercase("heLo"));
//        System.out.println(removeDuplicate("aaabbbabbaa"));
//        System.out.println(mul(4,5));
//        permutations("","abc");
        System.out.println(change(" 123 ")+Integer.parseInt("52"));

    }
//    public static int mul(int n,int m)
//    {
//        if(m>0) {
//            return n + mul(n, m-1);
//        }
//        return 0;
//    }
    public static void permutations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            permutations(first+ch+second,up.substring(1));
        }
    }
    public static int change(String s){
        return Integer.parseInt(s.trim());
    }
    public static String removeDuplicate(String s){
        if (s.isEmpty()) return s;
        if (s.length()>=2 && s.charAt(0)==s.charAt(1)){
            return removeDuplicate(s.substring(2));
        }else{
            return s.charAt(0)+removeDuplicate(s.substring(1));
        }
    }
    public static boolean isSorted(int[] arr,int s){
        if (s==arr.length-1) return true;
        if (arr[s]<arr[s+1]){
            return isSorted(arr,s+1);
        }
        return false;
    }
    public static char firstUppercase(String s){
        if (s.isEmpty()){
            return ' ';
        }
        char ch = s.charAt(0);
        if (ch>='A' && ch<='Z'){
            return ch;
        }else{
            return firstUppercase(s.substring(1));
        }

    }
    public static int sumofDigits(int n){
         if(n<10){
             return n;
         }
         int smallAns = n%10;//last digit of number for e.g 245 ld=5
        return smallAns+sumofDigits(n/10);
    }

    public static int product(int n,int m){
        if (m<=0){
            return 0;
        }
        return n+product(n,m-1);
    }
    public static boolean isPower(int n){
        if (n<=0) return false;
        if (n==1) return true;
        if (n%2!=0) return false;
        return isPower(n/2);
    }

}
