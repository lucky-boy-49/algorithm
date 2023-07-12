package main.simple;

import main.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 101. 对称二叉树
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) {
            return true;
        }
        que.offer(left);
        que.offer(right);
        while (!que.isEmpty()) {
            left = que.poll();
            right = que.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            que.offer(left.left);
            que.offer(right.right);

            que.offer(left.right);
            que.offer(right.left);
        }
        return true;
    }

}
