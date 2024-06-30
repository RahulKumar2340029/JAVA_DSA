package Hashmap;

import java.util.Stack;

public class Stacks {
    Stack<Integer> s;
    Stack<Integer> ss;

    public Stacks() {
        s = new Stack<>();
        ss = new Stack<>();
    }
    void push(int val){
        s.push(val);
        if (ss.size()==0||s.peek()<=ss.peek()){
            ss.push(val);
            return;
        }
    }
    int pop() throws StackEmptyException {
        if (s.size()==0){
            throw new StackEmptyException();
        }
        int temp = s.peek();
        s.pop();
        if (temp==ss.peek()){

            ss.pop();
        }
        return temp;
    }
    int getMin(){
        if (s.size()==0){
            return -1;
        }else{
            return ss.peek();
        }
    }
}
