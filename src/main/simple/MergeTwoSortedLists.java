package main.simple;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
            return list1;
        }
        ListNode result, end;
		if (list1 == null && list2 != null) {
			return list2;
		} else if (list1 != null && list2 == null) {
			return list1;
		}
        if (list1 != null && list2 != null && list1.val < list2.val) {
            result = end = list1;
            result.next = null;
            list1 = list1.next;
        } else {
            result = end = list2;
            result.next = null;
            list2 = list2.next;
        }
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				end.next = list1;
				end = list1;
				list1 = list1.next;
				end.next = null;
			} else {
				end.next = list2;
				end = list2;
				list2 = list2.next;
				end.next = null;
			}
		}
		if (list1 == null) {
			end.next = list2;
		} else {
			end.next = list1;
		}
		return result;
	}

}