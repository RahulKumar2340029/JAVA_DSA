public class Backtraking {
    public static void main(String[] args) {
        System.out.println(ways(3,3));
    }
    static int ways(int r, int c){
        //base condition
        if (r==1 || c==1) return 1;
        int left = ways(r-1,c);
        int right = ways(r,c-1);
        return left+right;
    }
}
