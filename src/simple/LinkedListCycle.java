package simple;
/**
 * 141. 环形链表
 * @author HJ
 */
public class LinkedListCycle {

	public boolean hasCycle(LinkedListCycleListNode head) {
		LinkedListCycleListNode slow = head, fast = head;
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
			if (fast == slow) {
				return true;
			}
			slow = slow.next;
		}
		return false;
	}

	public static void main(String[] args){
		LinkedListCycleListNode node4 = new LinkedListCycleListNode(-4);
		LinkedListCycleListNode node3 = new LinkedListCycleListNode(0);
		LinkedListCycleListNode node2 = new LinkedListCycleListNode(2);
		LinkedListCycleListNode node1 = new LinkedListCycleListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		LinkedListCycle cycle = new LinkedListCycle();
		boolean b = cycle.hasCycle(node1);
		System.out.println(b);
	}

}

class LinkedListCycleListNode {
     int val;
	LinkedListCycleListNode next;

	LinkedListCycleListNode(int x) {
        val = x;
        next = null;
     }
 }