package main.simple;

/**
 *  Intersection of Two Linked Lists
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //求出两个链表长度差
        //让长的链表的头指针先走长度差步
        //在同时走,相遇的时候就是公共结点
        //p1始终指向长的链表
        //p2始终指向短的链表
        ListNode p1 = headA;
        ListNode p2 = headB;
        int len1 = 0;
        int len2 = 0;
        while(p1!=null){
            len1++;
            p1 = p1.next;
        }
        while(p2!=null){
            len2++;
            p2 = p2.next;
        }
        int len = len1 -  len2;
        //这里需要注意的是
        //如果是大于也要将p1和p2重新指向
        //因为它们的指向在上述过程中已经发生了变化
        p1 = headA;
        p2 = headB;
        if(len < 0){
            //小于0说明A短B长
            p1 = headB;
            p2 = headA;
            len = len2 - len1;
        }
        while(len!=0){
            p1 = p1.next;
            len--;
        }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

}
