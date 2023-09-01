package main.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 */
public class ConstructBinaryTreeFromInorderPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        int len = postorder.length;
        TreeNode root = new TreeNode(postorder[len - 1]);
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int index = len - 1;
        for (int i = len - 2; i >= 0; i--) {
            int i1 = postorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[index]) {
                node.right = new TreeNode(i1);
                stack.push(node.right);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[index]) {
                    node = stack.pop();
                    index--;
                }
                node.left = new TreeNode(i1);
                stack.push(node.left);
            }
        }
        return root;
    }

}
