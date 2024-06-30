import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {8,1,3,6,34,78,2,9};
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int ele:arr){
//            pq.offer(ele);
//
//        }
        String[] s = {"bastille","abc","rohit","udit","aman"};
//        PriorityQueue<String> pq = new PriorityQueue<>((s1,s2)->s1.length()-s2.length()); //for length of string
//        PriorityQueue<String > pq = new PriorityQueue<>(Collections.reverseOrder()); // lexicographically desc
        PriorityQueue<String > pq = new PriorityQueue<>(); // lexicographically asc
        for(String ele: s){
            pq.offer(ele);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }

    }

}