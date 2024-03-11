package medium;

import main.medium.CopyListRandomPointer;
import main.medium.Node;
import org.junit.jupiter.api.Test;

class CopyListRandomPointerTest {

    @Test
    void copyRandomList() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node1.random = node2;
        node2.next = node3;
        node2.random = node2;
        node3.next = node4;
        CopyListRandomPointer clrp = new CopyListRandomPointer();
        clrp.copyRandomList(node1);
        clrp.copyRandomList2(node1);
    }
}