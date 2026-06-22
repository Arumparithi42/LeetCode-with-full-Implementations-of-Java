public class LinkedListCycle {
    // simple List node class
    static class Node {
        int val;
        Node next;
        Node(int v) { this.val = v; }
    }
    public boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(2);
        Node h4 = new Node(2);
        Node h5 = new Node(2);
        h1.next = h2; h2.next = h3; h3.next = h4;h4.next = h5; //h5.next = h3;
        System.out.println(new LinkedListCycle().hasCycle(h1));
    }
}
