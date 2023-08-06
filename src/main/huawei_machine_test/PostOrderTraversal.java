package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * 完全二叉树非叶子部分后序遍历
 */
public class PostOrderTraversal {

    private static class Node {
        Node left;
        Node right;
        String value;

        public Node(Node left, Node right, String value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public Node(String value) {
            this.value = value;
        }

    }

    public static void solution(String line) {
        LinkedList<Node> queue = new LinkedList<>();

        String[] split = line.split(" ");
        Node root = new Node(split[0]);
        queue.add(root);
        int i = 1;
        while (i < split.length) {
            Node pop = queue.pop();
            for (; i < split.length; i++) {
                if (pop.left == null) {
                    Node node = new Node(split[i]);
                    pop.left = node;
                    queue.add(node);
                    continue;
                }
                if (pop.right == null) {
                    Node node = new Node(split[i]);
                    pop.right = node;
                    queue.add(node);
                    i++;
                    break;
                }
            }
        }
        queue.clear();
        setQueue(queue, root);

        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            res.append(queue.pop().value);
        }
        System.out.println(res);

    }

    private static void setQueue(LinkedList<Node> queue, Node node) {
        if (node.left == null && node.right == null) {
            return;
        }
        if (node.left != null) {
            setQueue(queue, node.left);
        }
        if (node.right != null) {
            setQueue(queue, node.right);
        }
        queue.add(node);
    }

}
