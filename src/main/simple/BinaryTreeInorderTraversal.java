package main.simple;

import main.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreeInorderTraversal 是一个对二叉树执行中序遍历并返回按排序顺序的值列表的类。
 * 使用深度优先搜索（DFS）方法递归地遍历该树。
 */
public class BinaryTreeInorderTraversal {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return result;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        result.add(root.value);
        dfs(root.right);
    }

}
