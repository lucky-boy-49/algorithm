package main.simple;

import main.TreeNode;

public class MaximumDepthBinaryTree {

    /**
     * Calculates the maximum depth of a binary tree.
     *
     * @param root The root node of the binary tree.
     * @return The maximum depth of the binary tree.
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
