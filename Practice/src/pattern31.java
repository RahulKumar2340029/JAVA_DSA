public class pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
//        int original = n;
//        n = 2*n;
        for (int i = 1; i <=n*2-1 ; i++) {
            for (int j = 1; j <=n*2-1; j++) {
                int x = Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j));
                System.out.print(n-x+1+" ");
            }
            System.out.println();
        }
    }
}
