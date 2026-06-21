import java.util.HashSet;
public class IntersectionHahSet {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tailA = headA;
        ListNode tailB = headB;
        HashSet<ListNode> set = new HashSet<>(); 
        while(tailA != null){
            set.add(tailA);
            tailA = tailA.next;
        }
        while(tailB != null){
            if (set.contains(tailB))
                return tailB;
            tailB = tailB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2; a2.next = a3; a3.next = a4;

        ListNode b2 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        b1.next = b2;
        b2.next = a2;

        System.out.println(new IntersectionHahSet().getIntersectionNode(b1,a1).val);
    }
}
