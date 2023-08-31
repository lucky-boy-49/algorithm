package main.medium;

/**
 * 86. 分隔链表
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode min = new ListNode(), minTemp = min;
        ListNode max = new ListNode(), maxTemp = max;
        while (head != null) {
            if (head.val < x) {
                minTemp.next = head;
                minTemp = head;
                head = head.next;
            } else {
                maxTemp.next = head;
                maxTemp = head;
                head = head.next;
                maxTemp.next = null;
            }
        }
        minTemp.next = max.next;
        return min.next;
    }

}
