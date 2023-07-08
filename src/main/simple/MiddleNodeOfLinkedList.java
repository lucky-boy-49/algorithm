package main.simple;
/**
 * 876. 链表的中间结点
 * @author HJ
 */
public class MiddleNodeOfLinkedList {

	public ListNode2 middleNode(ListNode2 head) {
		ListNode2 q = head, p = head;
		while (q != null && q.next != null) {
			q = q.next.next;
			p = p.next;
		}
		return p;
	}

	public static void main(String[] args){

	}

}

class ListNode2 {
   int val;
   ListNode2 next;
   ListNode2() {}
   ListNode2(int val) { this.val = val; }
   ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}