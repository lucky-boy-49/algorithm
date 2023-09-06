package main.medium;

import org.graalvm.collections.Pair;

/**
 * @author HJ
 * @date 2023/9/6 09:41
 * @description 1123. 最深叶节点的最近公共祖先
 */
public class LowestCommonAncestorDeepestLeaves {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return f(root).getLeft();
    }

    private Pair<TreeNode, Integer> f(TreeNode root) {
        if (root == null) {
            return Pair.create(null, 0);
        }
        Pair<TreeNode, Integer> left = f(root.left);
        Pair<TreeNode, Integer> right = f(root.right);
        if (left.getRight() > right.getRight()) {
            return Pair.create(left.getLeft(), left.getRight() + 1);
        }
        if (left.getRight() < right.getRight()) {
            return Pair.create(right.getLeft(), right.getRight() + 1);
        }
        return Pair.create(root, left.getRight() + 1);
    }

}
