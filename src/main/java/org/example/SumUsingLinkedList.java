package org.example;

public class SumUsingLinkedList {

    ReverseLinkedList reverse;
    public static ListNode addNos(ListNode node1, ListNode node2)
    {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify handling the result
        ListNode current = dummyHead;
      int carry=0;
        while(node1 !=null || node2 !=null || carry!=0)
       {
           int s=carry;
           if(node1!=null)
           {
               s=s+node1.val;
               node1=node1.next;
           }
           if(node2!=null)
           {
               s=s+node2.val;
               node2=node2.next;
           }
           carry=s/10;
           current.next = new ListNode(s%10);
           current=current.next;
       }
        return dummyHead.next;  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant list)  // Return the value of the dummy head's next node (which is the actual head of the resultant)
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode head = addNos(node1, node2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
