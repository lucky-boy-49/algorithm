package main.simple;
/**
 * 876. 链表的中间结点
 * @author HJ
 */
public class MiddleNodeOfLinkedList {

	public ListNode middleNode(ListNode head) {
		ListNode q = head, p = head;
		while (q != null && q.next != null) {
			q = q.next.next;
			p = p.next;
		}
		return p;
	}

	public static void main(String[] args){

	}

}