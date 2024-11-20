package org.example;

public class IntersectionfLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA=getLength(headA);
        int lenB=getLength(headB);
        while(lenA<lenB)
        {
            headB=headB.next;
            lenB--;

        }
        while(lenB<lenA)
        {
            headA=headA.next;
            lenA--;

        }
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    public static int getLength(ListNode node)
    {
        int length=0;
        while(node!=null)
        {
            length++;
            node=node.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;


        ListNode intersection = getIntersectionNode(headA, headB);
        System.out.println("Intersection Node: " + (intersection!= null? intersection.val : "No intersection"));
    }
}
