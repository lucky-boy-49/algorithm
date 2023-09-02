package main.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author HJ
 * @date 2023/9/2 09:40
 * @description 129. 求根节点到叶节点数字之和
 */
public class SumRootLeafNumbers {

    public int sumNumbers(TreeNode root) {
        int res = 0;
        Deque<TreeNode> queueNode = new LinkedList<>();
        Deque<Integer> numNode = new LinkedList<>();
        queueNode.offer(root);
        numNode.offer(0);
        while (!queueNode.isEmpty() && !numNode.isEmpty()) {
            TreeNode node = queueNode.poll();
            Integer num = numNode.poll();
            if (node.left == null && node.right == null) {
                if (num != null) {
                    num = num * 10 + node.val;
                    res += num;
                }
            } else {
                if (num != null) {
                    if (node.left != null) {
                        queueNode.offer(node.left);
                        numNode.offer(num * 10 + node.val);
                    }
                    if (node.right != null) {
                        queueNode.offer(node.right);
                        numNode.offer(num * 10 + node.val);
                    }
                }
            }
        }
        return res;
    }

}
