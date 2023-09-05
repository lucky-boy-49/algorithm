package main.simple;

/**
 * @author HJ
 * @date 2023/9/5 17:53
 * @description 530. 二叉搜索树的最小绝对差
 */
public class MinimumAbsoluteDifferenceInBst {

    int pre;
    int ans;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }

}
