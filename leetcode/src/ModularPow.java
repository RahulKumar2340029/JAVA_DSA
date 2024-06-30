public class ModularPow {
    public static void main(String[] args) {
        System.out.println(pow(10,4));
    }
    static int pow(int x,int N){
        if (N==0){
            return 1;
        }else if (N==1){
            return x;
        }else{
            int R = pow(x,N/2);
            if (N%2==0){
                return R*R;
            }else{
                return R*x*R;
            }
        }
    }
}
