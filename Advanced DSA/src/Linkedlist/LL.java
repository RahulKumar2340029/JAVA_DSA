package Linkedlist;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        tail.next  = node;
        node = tail;
        if (tail==null){
            insertFirst(value);
            return;
        }
        size+=1;
    }
    public void insert(int value,int index){
        if (index==size){
            insertFirst(value);return;
        }
        if (index==size){
            insertLast(value);return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        tail = null;
        size--;
        return tail.value;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        private int value;

        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
