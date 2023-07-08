package test.simple;

import main.simple.ListNode;
import main.simple.ReverseList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void reverse() {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ReverseList reverseList = new ReverseList();
        ListNode reverse = reverseList.reverse(listNode1);
        while (reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

    }

    @Test
    void reverse2() {

        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ReverseList reverseList = new ReverseList();
        ListNode reverse = reverseList.reverse2(listNode1);
        while (reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }

    }
}