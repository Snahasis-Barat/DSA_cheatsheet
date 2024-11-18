package org.example;

public class DetectCycleLinkedList {

    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect and remove cycle
        System.out.println(detectStartOfCycle(head)!=null?detectStartOfCycle(head).val:"No cycle detected");

       
    }

    private static ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;

}

private static ListNode detectStartOfCycle(ListNode head)
{
    ListNode meet=detectCycle(head);
    ListNode start=head;
    while(start!=meet && meet!=null)
    {
        start=start.next;
        meet=meet.next;

    }
    if(meet==null)
    {
        return null;  // No cycle found. Return null.
    }

    return start;
}
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
