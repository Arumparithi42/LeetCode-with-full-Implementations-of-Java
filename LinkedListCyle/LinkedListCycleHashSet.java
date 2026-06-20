import java.util.HashSet;

class Node{
    int val;
    Node next = null;
    Node(int data){
        this.val = data;
    }
}


public class LinkedListCycleHashSet{
    public boolean hasCycle(Node head){
        HashSet<Node> set = new HashSet<>();
        Node tail = head;
        while(tail != null){
            if (set.contains(tail)){
                return true;
            }
            set.add(tail);
            tail = tail.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(2);
        Node h4 = new Node(2);
        Node h5 = new Node(2);
        h1.next = h2; h2.next = h3; h3.next = h4;h4.next = h5; h5.next = h3;

        System.out.println(new LinkedListCycleHashSet().hasCycle(h1));
    }
}