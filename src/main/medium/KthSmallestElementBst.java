package main.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author HJ
 * @date 2023/9/5 18:14
 * @description 230. 二叉搜索树中第K小的元素
 */
public class KthSmallestElementBst {

    int i = 0;

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        TreeNode node = root, pre = null;
        while (node != null) {
            stack.offerFirst(node);
            node = node.left;
        }
        while (!stack.isEmpty() && i < k) {
            i++;
            pre = node = stack.pollFirst();
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.offerFirst(node);
                    node = node.left;
                }
            }
        }
        if (pre != null) {
            return pre.val;
        } else {
            return 0;
        }
    }

    private void dfs(TreeNode root) {
        dfs(root.left);

    }

}
