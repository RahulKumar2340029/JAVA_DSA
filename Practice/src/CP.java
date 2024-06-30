public class CP {
    public static <String> void main(String[] args) {
        System.out.println(meetat(50,50,2,3,3,5));
    }
    public static int meetat(int r,int s,int m,int n,int p,int q){
        int ax=0,ay=0,bx=r,by=s,count=0;
        while (ax<bx && ay<by){
            ax+=m;ay+=n;
            bx-=p;by-=q;
            if (ax==bx && ay==by){
                return count;
            }
            count++;
        }
        return -1;
    }
}
