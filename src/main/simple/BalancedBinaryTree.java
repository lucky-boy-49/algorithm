package main.simple;

import main.TreeNode;

public class BalancedBinaryTree {

    private boolean is = true;

    public boolean isBalanced(TreeNode root) {
        isBalancedTree(root);
        return is;
    }

    public int isBalancedTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isBalancedTree(root.left) + 1;
        int right = isBalancedTree(root.right) + 1;
        if (is) {
            is = Math.abs(left - right) > 1;
            return Math.abs(left - right);
        }
        return Math.max(left, right);
    }

}
