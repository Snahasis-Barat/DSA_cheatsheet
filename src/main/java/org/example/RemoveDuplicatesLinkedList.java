package org.example;

import java.util.*;

public class RemoveDuplicatesLinkedList {

    public static ListNode  removeDuplicates(ListNode head) {

       Set<Integer> distinct=new HashSet<>();
       ListNode current=head;
       ListNode prev=null;
        if (head == null) return null; // Handle the edge case for empty list
       while(current!=null)
       {
           if(distinct.contains(current.val))
           {
               prev.next=current.next;
           }
           else{
               distinct.add(current.val);
               prev=current;
           }
           current=current.next;
       }
       return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(1);
        ListNode distinctList=removeDuplicates(head);
        while(distinctList!=null)
        {
            System.out.print(distinctList.val+" ");
            distinctList=distinctList.next;
        }


    }
}
