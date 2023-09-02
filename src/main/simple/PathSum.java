package main.simple;

/**
 * @author HJ
 * @date 2023/9/2 09:23
 * @description 112. 路径总和
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return pathSum(root, targetSum, 0);
    }

    private boolean pathSum(TreeNode root, int targetSum, int curSum) {
        if (root.left == null && root.right == null && root.val + curSum == targetSum) {
            return true;
        }
        boolean leftRes = false;
        if (root.left != null) {
            leftRes = pathSum(root.left, targetSum, curSum + root.val);
        }
        boolean rightRes = false;
        if (leftRes) {
            return true;
        } else {
            if (root.right != null) {
                leftRes = pathSum(root.right, targetSum, curSum + root.val);
            }
            return leftRes;
        }
    }

}
