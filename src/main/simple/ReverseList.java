package main.simple;

/**
 * 反转链表
 */
public class ReverseList {

    /**
     * 迭代
     * @param head 头节点
     * @return 反转结果
     */
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

    /**
     * 递归
     * @param node 节点
     * @return 反转结果
     */
    public ListNode reverse2(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode result = reverse2(node.next);
        node.next.next = node;
        node.next = null;
        return result;
    }

}
