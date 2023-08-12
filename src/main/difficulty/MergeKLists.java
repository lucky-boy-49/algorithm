package main.difficulty;

import java.util.PriorityQueue;

/**
 * 23. 合并 K 个升序链表
 */
public class MergeKLists {

    public ListNode Solution(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode listNode : lists) {
            ListNode list = listNode;
            while (list != null) {
                pq.offer(list.val);
                list = list.next;
            }
        }
        Integer poll = pq.poll();
        ListNode res = null;
        if (poll != null) {
            res = new ListNode(poll, null);
        }
        ListNode curNode = res;
        while (!pq.isEmpty()) {
            poll = pq.poll();
            if (poll != null) {
                ListNode node = new ListNode(poll, null);
                curNode.next = node;
                curNode = node;
            }

        }
        return res;
    }

}
