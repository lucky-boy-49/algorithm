package main.simple;


import javax.xml.transform.Result;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 111 . 二叉树的最小深度
 */
public class MinimumDepthBinaryTree {

    /**
     * 深度优先遍历
     * @param root 根节点
     * @return 最小深度
     */
    public int minDepth(TreeNode root) {
//        int depth = Integer.MAX_VALUE;
//        return DFT(root, 1, depth);

        return BFT(root);

    }

    public int DFT(TreeNode root, int depth, int result) {

        if (root.left == null && root.right == null) {
            return Math.min(depth, result);
        }

        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        depth++;

        if (root.left != null) {
            left = DFT(root.left, depth, result);
        }

        if (root.right != null) {
            right = DFT(root.right, depth, result);
        }

        if (left != Integer.MAX_VALUE) {
            result = Math.min(result, left);
        }

        if (right != Integer.MAX_VALUE) {
            result = Math.min(result, right);
        }

        return result;

    }

    public int BFT(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 1;

        TreeNode tmp;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                tmp = queue.poll();
                if (tmp != null && tmp.left == null && tmp.right == null) {
                    return depth;
                }
                if (tmp != null && tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp != null && tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            depth++;
        }

        return -1;

    }

}
