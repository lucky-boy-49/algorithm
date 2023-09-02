package main.medium;

/**
 * @author HJ
 * @date 2023/9/2 11:17
 * @description 236. 二叉树的最近公共祖先
 */
public class LowestCommonAncestorBinaryTree {

    private TreeNode ans;

    public LowestCommonAncestorBinaryTree() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

}
