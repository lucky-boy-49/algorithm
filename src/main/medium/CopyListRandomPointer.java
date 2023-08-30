package main.medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 138. 复制带随机指针的链表
 */
public class CopyListRandomPointer {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map1 = new HashMap<>();
        Map<Node, List<Node>> map2 = new HashMap<>();
        Node res = null, tmp = null;
        while (head != null) {
            if (res == null) {
                res = tmp = new Node(head.val);
            } else {
                tmp.next = new Node(head.val);
                tmp = tmp.next;
            }
            map1.put(head, tmp);
            if (head.random != null) {
                if (map1.containsKey(head.random)) {
                    tmp.random = map1.get(head.random);
                } else {
                    if (map2.containsKey(head.random)) {
                        map2.get(head.random).add(tmp);
                    } else {
                        ArrayList<Node> list = new ArrayList<>();
                        list.add(tmp);
                        map2.put(head.random, list);
                    }
                }
                if (map2.containsKey(head)) {
                    List<Node> nodes = map2.get(head);
                    Node finalTmp = tmp;
                    nodes.forEach(a -> a.random = finalTmp);
                    map2.remove(head);
                }
            }

            head = head.next;
        }
        return res;
    }

    Map<Node, Node> cachedNode = new HashMap<>();

    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }

}
