package main.medium;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/3 10:29
 * @description 103. 二叉树的锯齿形层序遍历
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        int c = 0;
        while (!queue.isEmpty()) {
            c++;
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            if (c % 2 == 0) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }

}
