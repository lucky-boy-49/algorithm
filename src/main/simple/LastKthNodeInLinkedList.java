package main.simple;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点 LCOF
 */
public class LastKthNodeInLinkedList {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode later = head, prev = null;
        int i = 1;
        while (i <= k) {
            prev = head.next;
            i++;
        }

        if (prev != null) {
            while (prev.next != null) {
                prev = prev.next;
                later = later.next;
            }
        }

        return later;

    }

}
