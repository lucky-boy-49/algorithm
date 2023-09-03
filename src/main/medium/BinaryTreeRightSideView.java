package main.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/3 09:26
 * @description 199. 二叉树的右视图
 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Deque<TreeNode> queue1 = new LinkedList<>();
        Deque<TreeNode> queue2 = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue1.add(root);
        while (!queue1.isEmpty()) {
            TreeNode node = null;
            while (!queue1.isEmpty()) {
                node = queue1.poll();
                if (node.left != null) {
                    queue2.add(node.left);
                }
                if (node.right != null) {
                    queue2.add(node.right);
                }
            }
            res.add(node.val);
            node = null;
            while (!queue2.isEmpty()) {
                node = queue2.poll();
                if (node.left != null) {
                    queue1.add(node.left);
                }
                if (node.right != null) {
                    queue1.add(node.right);
                }
            }
            if (node != null) {
                res.add(node.val);
            }
        }
        return res;
    }

}
