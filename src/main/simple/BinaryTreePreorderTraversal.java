package main.simple;

import main.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                results.add(root.value);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return results;
    }

}
