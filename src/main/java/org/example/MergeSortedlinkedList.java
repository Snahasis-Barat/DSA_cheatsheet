package org.example;

public class MergeSortedlinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode mergedListDummy = new ListNode(-1);
        ListNode mergedList = mergedListDummy;

        while(l1!=null  && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                mergedList.next=l1;
                l1=l1.next;

            }
            else{
                mergedList.next=l2;
                l2=l2.next;
            }
            mergedList=mergedList.next;
        }
        while(l1!=null)
        {
            mergedList.next=l1;
            l1=l1.next;
            mergedList=mergedList.next;
        }
        while(l2!=null)
        {
            mergedList.next=l2;
            l2=l2.next;
            mergedList=mergedList.next;
        }

        return mergedListDummy.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(l1, l2);

        while (mergedList!=null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }

    }
}
