package main.simple;

/**
 * 100. 相同的树
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            boolean res1 = true;
            boolean res2 = true;
            if (q.left != null || p.left != null) {
                res1 = isSameTree(p.left, q.left);
            }
            if (q.right != null || p.right != null) {
                res2 = isSameTree(p.right, q.right);
            }
            return res1 && res2;
        }
        return false;
    }

}
