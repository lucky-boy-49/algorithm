package main.simple;

/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        if (slow != null) {
            slow = reverse(slow);
        }

        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;

    }

    public ListNode reverse(ListNode head) {
        ListNode prev = head, next = head.next, tmp;
        prev.next = null;

        while (next != null) {
            tmp = next;
            next = next.next;
            tmp.next = prev;
            prev = tmp;
        }

        return prev;
    }

}
