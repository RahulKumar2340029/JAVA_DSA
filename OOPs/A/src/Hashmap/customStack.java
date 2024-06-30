package Hashmap;

import java.util.Stack;

public class customStack {
    public static void main(String[] args) {
        Stacks s= new Stacks();
        s.push(10);
        s.push(0);
        s.push(15);
        s.push(1);
        s.push(3);
        System.out.println(s.getMin());

    }

}
