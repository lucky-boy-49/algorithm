package main.simple;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/3 10:08
 * @description 637. 二叉树的层平均值
 */
public class AverageLevelsBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        Deque<TreeNode> queue1 = new LinkedList<>();
        Deque<TreeNode> queue2 = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue1.add(root);
        while (!queue1.isEmpty()) {
            TreeNode node;
            double sum = 0, count = 0;
            while (!queue1.isEmpty()) {
                node = queue1.poll();
                count++;
                sum += node.val;
                if (node.left != null) {
                    queue2.add(node.left);
                }
                if (node.right != null) {
                    queue2.add(node.right);
                }
            }
            if (count != 0) {
                res.add(sum/count);
            }
            sum = 0;
            count = 0;
            while (!queue2.isEmpty()) {
                node = queue2.poll();
                count++;
                sum += node.val;
                if (node.left != null) {
                    queue1.add(node.left);
                }
                if (node.right != null) {
                    queue1.add(node.right);
                }
            }
            if (count != 0) {
                res.add(sum/count);
            }
        }
        return res;
    }

}
