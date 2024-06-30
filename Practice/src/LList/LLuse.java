package LList;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class LLuse {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
//        System.out.println(Integer.toBinaryString(findTwosComplement(-5) ));
        System.out.print("\nEnter first list: ");
        Node<Integer> head = takeInput();//createLinkedList();
//        System.out.print("\nEnter second list: ");
//        Node<Integer> head2 = takeInput();
//        increment(head);
//        head = insert_at_ith_index(head,20,10);
//        head=delete_node(head,3);
//        print(head);
//        System.out.println(find(head,3));
//        System.out.println(length(head));
//        System.out.println(print_ith(head,2));
//        head = appendlastN(head,4);
//        head = deleteDuplicates(head);
//        head = evenafterodd(head);
//        print(head);
//        head = insert(head,20,0);
//        head = deleterec(head,3);
//        head = reverserec(head);
//        Node<Integer> merged = mergelist(head,head2);
//        System.out.println(midpoint(head));
//        head = mergesort(head);
//        System.out.println(Arrays.toString(nextLargerNodes(head)));
//        print_rec(head);
        head = bubbleSort(head);
        print(head);
    }
    //Flatten linkedlist
//    public static Node<Integer> merge(Node a,Node b){
//        Node<Integer> temp = new Node<>(0);
//        Node res = temp;
//        while(a!=null && b!=null){
//            if (a.bottom<b.bottom){
//                temp.bottom = a;
//                temp = temp.bottom;
//                a = a.bottom;
//
//            }else{
//                temp.bottom = b;
//                temp = temp.bottom;
//                b = b.bottom;
//            }
//        }
//        if(a!=null) temp.bottom = a;
//        else{
//            temp.bottom = b;
//        }
//        return res;
//    }
//    public static Node<Integer> flatten(Node<Integer> head){
//        if (head==null || head.next==null) return head;
//        head.next = flatten(head.next);
//        head = merge(head,head.next);
//        return head;
//    }
    public static Node<Integer> bubbleSort(Node<Integer> head){
        if (head==null || head.next==null) return head;
        int n = length(head);
        Node<Integer> current= head;
        Node<Integer> prev = null;
        for (int i = 0; i < n; i++) {
            if (current.data<=current.next.data){
                prev = current;
                current = current.next;
            }else{
                if (prev==null){
                    Node<Integer> next = current.next;
                    current.next = next.next;
                    next.next = current.next;
                    prev = next;
                }else{
                    Node<Integer> next = current.next;
                    prev.next = current.next;
                    current.next = next.next;
                    next.next = current;
                    prev = next;

                }
            }
        }
        return head;
    }

    public static int[] nextLargerNodes(Node<Integer> head) {
        int[] result = new int[length(head)];
        Node<Integer> temp = head;int val=0;
        for (int i = 0; i < result.length; i++) {
            if (temp!=null) {
                val = temp.data;
            }

            while (temp != null && temp.data <= val) {
                temp = temp.next;
            }

            if (temp != null) {
                result[i] = temp.data;
            } else {
                result[i] = 0;
            }

            if (temp != null) {
                temp = temp.next;
            }
        }

        return result;
    }
    public static int findTwosComplement(int decimalNumber) {
        int numberOfBits = 32;

        // Create a bitmask to get the lower bits
        int bitmask = (1 << numberOfBits) - 1;

        // Two's complement: bitwise NOT and add 1
        int twosComplement = (~decimalNumber & bitmask) + 1;

        return twosComplement;
    }

//    public static Node<Integer> swapnodes(Node<Integer> head,int a,int b){
//        if (head==null || head.next==null) return head;
//        if (head.next.next==null){
//            head.next = head;
//            head = null;
//            return head.next;
//        }
//
//    }
//    public static Node<Integer> deleteMN(Node<Integer> head,int m,int n){
//        if (m==0||head==null){
//            return null;
//        }
//        if (n==0) return head;
//        int c1=1,c2=1;
//        Node<Integer> t1 = head;
//        while ()
//    }
    public static Node<Integer> mergesort(Node<Integer> head){
        if (head==null || head.next==null) return head;
        Node<Integer> mid = midPointII(head);
        Node<Integer> head2 = mid.next;
        mid.next = null;
        Node<Integer> sortedHead1 = mergesort(head);
        Node<Integer> sortedHead2 = mergesort(head2);

        // Merge the sorted halves
        return mergelist(sortedHead1, sortedHead2);

    }
    public static Node<Integer> midPointII(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> mergelist(Node<Integer> head1,Node<Integer> head2){
        if (head1==null && head2==null) return null;
        if (head1==null)return head2;
        if (head2==null) return head1;
        Node<Integer> temp = new Node<>(0);
        Node<Integer> dummy =temp;
        while (head1!=null && head2!=null){
            if (head1.data<head2.data){
                dummy.next = head1;
                head1 = head1.next;
            }else{
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }
        if (head1!=null){
            dummy.next = head1;
//            head1 = head1.next;
        }
        if (head2!=null){
            dummy.next = head2;
//            head2 = head2.next;//this is also valid but as only this is present why move head directly link it to dummy
        }
        return temp.next;

    }
    public static int midpoint(Node<Integer> head){
        if (head==null) return 0;
        if (head.next==null) return head.data;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static Node<Integer> reverserec(Node<Integer> head){
        if (head==null || head.next==null) return head;
        Node<Integer> smallprob = reverserec(head.next);
        head.next.next = head;
        head.next = null;

//        head = smallprob;
        return smallprob;
    }
    public static Node<Integer> evenafterodd(Node<Integer> head){
        if (head==null) return head;
        Node<Integer> oddh = null,oddt = null,evenh = null , event = null;
        //iterate for odd list
        Node<Integer> temp = head;
        while (temp!=null){
            if (temp.data%2!=0){
                if (oddh==null){
                    oddh = temp;
                    oddt = temp;
                }else{
                    oddt.next = temp;
                    oddt = oddt.next;
                }
            }else{
                if (evenh==null){
                    evenh = temp;
                    event = temp;
                }else{
                    event.next = temp;
                    event = event.next;
                }
            }
            temp = temp.next;
        }
        if (oddt!=null && event!=null){
            oddt.next = evenh;
            event.next = null;
        }

       if (oddh==null){
           return evenh;
       }else{
           return oddh;
       }
    }
    //print recursive
    public static void print_rec(Node<Integer> head){
        if (head==null){
            return;
        }
        System.out.print(head.data+" ");
         print_rec(head.next);
    }
    //insert recursive
    public static Node<Integer> insert(Node<Integer> head,int val , int k){
        if(k==0){
            Node<Integer> newnode = new Node<>(val);
            newnode.next = head;
            return newnode;
        }else{
            Node<Integer> smallerhead = insert(head.next,val,k - 1);
            head.next = smallerhead;
            return head;
        }
    }
    //delete nodes recursively
    public static Node<Integer> deleterec(Node<Integer> head,int pos){
        if (head==null) return head;
        if (pos==0){
            return head.next;
        }
        Node<Integer> small= deleterec(head.next,pos-1);
        head.next = small;
        return head;
    }
//    public static Node<Integer> deleteDuplicatesREC(Node<Integer> head){
//
//    }
    public static Node<Integer> deleteDuplicates(Node<Integer> head){
        if (head==null) return head;
        Node<Integer> temp = head;
        while (temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node<Integer> appendlastN(Node<Integer> head, int k) {
        int n = length(head) - k;
        int count = 1;
        Node<Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        while (count <n) {
            count++;
            head = head.next;
        }
        Node<Integer> newHead = head;
        head = head.next;
        newHead.next = null;
        return head;
    }

    //    find node in linkedlist
    public static int find(Node<Integer> head,int k){
        if (head==null) return -1;
        int cnt=0;
        if (head.data==k){
            return cnt;
        }
        int ans = find(head.next,k);
        if (ans!=-1){
            return 1+ans;
        }else{
            return -1;
        }
    }
    public  static Node<Integer> delete_node(Node<Integer> head,int pos){
        if (head==null) return null;
        int cnt=1;
        Node<Integer> temp = head;
        if (pos==0){
            return head.next;
        }
        while (cnt<pos && temp!=null){
            cnt++;
            temp = temp.next;
        }
        if ( temp!=null && temp.next!=null){
            temp.next = temp.next.next;
        }

        return head;
    }
    public static Node<Integer> insert_at_ith_index(Node<Integer> head,int val,int pos){
        Node<Integer> newnode = new Node<>(val);


        if (pos==0 || head==null){
            newnode.next = head;
            head = newnode;
        }else {

            int count = 1;
            Node<Integer> temp = head;
            while (count < pos && temp!=null) {
                count++;
                temp = temp.next;
            }
            if (temp!=null) {
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
            return head;
    }
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data!=-1){
            Node<Integer> currentNode = new Node<>(data);
            if (head==null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
//                tail = tail.next;
                tail = currentNode;
            }
            data = s.nextInt();

        }
        return head;

    }
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public  static int length(Node<Integer> head){
        Node<Integer> temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static int print_ith(Node<Integer> head,int i){
        Node<Integer> temp = head;
        int count=1;
        while (count<=i){
            count++;
            temp = temp.next;
        }
        return temp.data;
    }
    public static void print(Node<Integer> head){
//        while(head!=null){
//            System.out.print(head.data+" ");
//            head = head.next;
//        }
        for (Node<Integer> i = head; i!=null; i = i.next) {
            System.out.print(i.data+" ");
        }
        System.out.println();

    }
    public static void increment(Node<Integer> head){
        while(head!=null){
            head.data++;
            head = head.next;
        }
    }
}
