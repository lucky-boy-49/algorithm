package main.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU 缓存
 * @author HJ
 */
public class LRUCache {

    static class Node {

        int key;
        int val;
        Node next;
        Node pre;

        public Node(int key, int val) {
            this.val = val;
            this.key = key;
        }

        public Node() {
        }
    }

    int capacity;
    int curSize;
    Node head, tail;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        map = new HashMap<>();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveNode(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            moveNode(node);
        } else {
            if (curSize < capacity) {
                addNode(key, value);
                curSize++;
            } else if (curSize == capacity) {
                Node node = head.next;
                head.next = node.next;
                node.next.pre = head;
                map.remove(node.key);
                addNode(key, value);
            }
        }
    }

    private void addNode(int key, int value) {
        Node node = new Node(key, value);
        map.put(key, node);
        tail.pre.next = node;
        node.pre = tail.pre;
        node.next = tail;
        tail.pre = node;
    }

    private void moveNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = tail;
        tail.pre.next = node;
        node.pre = tail.pre;
        tail.pre = node;
    }

}
