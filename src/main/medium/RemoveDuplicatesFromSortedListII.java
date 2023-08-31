package main.medium;

/**
 * 82. 删除排序链表中的重复元素 II
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode tmp;
        ListNode res = new ListNode(-1), cur;
        tmp = res;
        while (head != null) {
            cur = head;
            head = head.next;
            boolean flag = true;
            while (head != null) {
                if (head.val == cur.val) {
                    flag = false;
                    head = head.next;
                } else {
                    break;
                }
            }
            if (flag) {
                tmp.next = cur;
                tmp = cur;
                tmp.next = null;
            }
        }
        return res.next;
    }

}
