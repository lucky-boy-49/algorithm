package main.medium;

/**
 * 114. 二叉树展开为链表
 */
public class FlattenBinaryTreeLinkedList {

    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;
                root.left = null;
            }
            root = root.right;
        }
    }

}
