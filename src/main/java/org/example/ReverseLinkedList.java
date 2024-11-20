package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

public ListNode reverseLinkedList(ListNode node)
{
    ListNode prev=null;
    ListNode current=node;
    while(current!=null)
    {
        ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    return prev;

}

public static void main(String[] args) {

    ListNode node1 = new ListNode(7);
    node1.next = new ListNode(4);
    node1.next.next = new ListNode(3);
    node1.next.next.next = new ListNode(2);

    ListNode start= new ReverseLinkedList().reverseLinkedList(node1);
    while(start!=null)
    {
        System.out.println(start.val);
        start=start.next;
    }
}
}
