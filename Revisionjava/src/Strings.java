public class Strings {
    public static void main(String[] args) {
        String name = "Rahul Kumar";
//        System.out.println(name);
        String name2 = new String("Kunal");
        System.out.println(name.equals(name2));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        String a = "abcdefedcba";
        System.out.println(palindrome(a));

    }
    static boolean palindrome(String str){
        if (str == null || str.length()==0) return true;
        str = str.toLowerCase();
        for (int i = 0; i <=str.length()/2 ; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false ;
            }
        }
        return true;
    }
}
