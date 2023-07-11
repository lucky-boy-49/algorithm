package main.simple;

/**
 *  Remove Duplicates from Sorted List
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode tmp = head;

        while (tmp != null) {
            if (tmp.next == null) {
                break;
            }
            if (tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }

        return head;

    }

}
