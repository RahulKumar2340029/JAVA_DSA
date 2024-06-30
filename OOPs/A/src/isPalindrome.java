import java.math.BigInteger;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("Hello12321olleH@!#$%"));
        System.out.println(multiplyString2("8015","12"));
    }
    public static boolean isPalindrome2(String s){
        String clrst = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String result = new StringBuilder(clrst).reverse().toString();
        return result.equals(clrst);
    }
    static String multiplyString2(String a,String b){
        BigInteger a1 = new BigInteger(a);
        BigInteger b1= new BigInteger(b);
        BigInteger ans = a1.multiply(b1);
        return ans.toString();
    }
    static String multiplyString(String a,String b){
        String a1 = a.replaceAll("[^a-zA-Z0-9]","");
        String b1 = b.replaceAll("[^a-zA-Z0-9]","");
        return String.valueOf(Integer.valueOf(a1)*Integer.valueOf(b1));
    }
}
