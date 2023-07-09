package main.medium;

import main.simple.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 142 . 链表循环II
 */
public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head, fast = head;

        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;

        } while (fast != slow);


        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

}
