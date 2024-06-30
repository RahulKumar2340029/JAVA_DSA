public class kkrecursion {
    public static void main(String[] args) {
        System.out.println(remove("baccad",'a'));
        subset("","abc");
    }
    public static String remove(String str,char ch){
        if(str.isEmpty()){
            return "";
        }
        String ans = "";
        char c = str.charAt(0);
        if(c==ch){
            return remove(str.substring(1),ch);
        }else{
            return c + remove(str.substring(1),ch);
        }

    }

    //take it or ignore it
    public static void subset(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p + ch,up.substring(1));
        subset(p, up.substring(1));
    }
}
