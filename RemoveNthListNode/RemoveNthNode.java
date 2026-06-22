class ListNode {
    int val;
    ListNode next;

    // Constructor
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


class removeNthListNode {
    public static ListNode removeNthLastNode(ListNode head, int n) {
        
        
        ListNode tail = head;
        ListNode del = head;
        for(int i = 0; i < n; i++){
            tail = tail.next;
        }
        if (tail == null)
            return head.next;
        while(tail.next != null){
            del = del.next;
            tail = tail.next;
        }
        
        del.next = del.next.next;
        return head;
    }
}