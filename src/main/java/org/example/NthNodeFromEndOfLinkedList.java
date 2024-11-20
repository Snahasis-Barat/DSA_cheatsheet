package org.example;

public class NthNodeFromEndOfLinkedList {

    public static ListNode findNthFromEnd(ListNode head,int n) {

        ListNode first=head;
        ListNode second=head;
        for(int i=0;i<n;i++)
        {
            if(first==null)
                return null;
            first=first.next;
        }
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        return second;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println(findNthFromEnd(head,2).val);

    }
}
