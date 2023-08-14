package main.simple;

/**
 * 617. 合并二叉树
 */
public class MergeTrees {

    public TreeNode solution(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = solution(root1.left, root2.left);
        merged.right = solution(root1.right, root2.right);
        return merged;
    }

}
