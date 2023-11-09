package Linkedlist;

public class Main {
    public static void main(String[] args) {
       LL obj = new LL();
       obj.insertFirst(24);
       obj.insertFirst(45);
       obj.insertFirst(63);
       obj.insertFirst(100);
       obj.insertFirst(152);
       obj.insertFirst(12);
       obj.insertLast(19);
       obj.insert(69,3);
        System.out.println(obj.deleteFirst());
        System.out.println(obj.deleteLast());

       obj.display();
    }
}