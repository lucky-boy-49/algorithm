package main.simple;

/**
 * 2236. 判断根结点是否等于子结点之和
 */
public class RootEqualsSumChildren {

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

}
