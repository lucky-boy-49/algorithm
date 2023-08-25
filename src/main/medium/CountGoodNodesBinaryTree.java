package main.medium;

/**
 * 1448. 统计二叉树中好节点的数目
 */
public class CountGoodNodesBinaryTree {

    public int goodNodes(TreeNode root) {
        int ans = 1;
        if (root.left != null) {
            ans += getGoodNodes(root.left, root.val);
        }
        if (root.right != null) {
            ans += getGoodNodes(root.right, root.val);
        }
        return ans;
    }

    private int getGoodNodes(TreeNode root, int maxNum) {
        int ans = 0;
        if (root.val >= maxNum) {
            ans = 1;
            maxNum = root.val;
        }
        if (root.left != null) {
            ans += getGoodNodes(root.left, maxNum);
        }
        if (root.right != null) {
            ans += getGoodNodes(root.right, maxNum);
        }
        return ans;
    }
}
