package simple;
/**
 * 19. 删除链表的倒数第 N 个结点
 * @author HJ
 */
public class DeletLinkListNode {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// 双指针，一个走前，一个走后，相差n-1
		int i = 1, j =1;
		ListNode nodeI = head, nodeJ = head, preNode = null;
		while (nodeJ.next != null) {
			if (j - i == n - 1) {
				preNode = nodeI;
				nodeI = nodeI.next;
				nodeJ = nodeJ.next;
			} else {
				nodeJ = nodeJ.next;
				j++;
			}
		}
		if (preNode == null) {
			return nodeI.next;
		} else {
			preNode.next = nodeI.next;
			return head;
		}
	}

	public static void main(String[] args){
		DeletLinkListNode deletLinkListNode = new DeletLinkListNode();
		ListNode node5 = new ListNode(5, null);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		ListNode listNode = deletLinkListNode.removeNthFromEnd(node1, 2);
	}

}