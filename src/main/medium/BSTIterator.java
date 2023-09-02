package main.medium;

/**
 * @author HJ
 * @date 2023/9/2 10:11
 * @description 173. 二叉搜索树迭代器
 */
public class BSTIterator {

    TreeNode root;

    public BSTIterator(TreeNode root) {
        this.root = inorderTraversal(root);
    }

    public int next() {
        TreeNode res = root;
        root = root.right;
        return res.val;
    }

    public boolean hasNext() {
        return root != null;
    }

    private TreeNode inorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = inorderTraversal(root.left);
        TreeNode right = inorderTraversal(root.right);
        if (left != null && right != null) {
            TreeNode node = left;
            while (node.right != null) node = node.right;
            node.right = root;
            root.right = right;
            return left;
        } else if (left != null) {
            TreeNode node = left;
            while (node.right != null) node = node.right;
            node.right = root;
            return left;
        } else if (right != null) {
            root.right = right;
            return root;
        } else {
            return root;
        }
    }

}
