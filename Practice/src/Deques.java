import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Deques {
    public static void main(String[] args) {
//        Deque<Integer> deck = new ArrayDeque<>();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        for (int ele:arr){
//            deck.add(ele);
//        }
//        System.out.println(deck.getFirst());
        HashSet<Integer> set = new HashSet<>();
        for (int ele:arr){
            set.add(ele);
        }
        for (int ele:set){
            System.out.print(ele+" ");
        }
    }
}
