public class Recursionjava {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(fact(5));
    }
    static int sum(int n){
        if (n!=0){
            return n+sum(n-1);
        }else{
            return n;
        }
    }
    static int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
