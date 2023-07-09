package test.simple;

import main.simple.MinimumDepthBinaryTree;
import main.simple.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthBinaryTreeTest {

    @Test
    void minDepth() {

        MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode15 = new TreeNode(15);
        root.right = new TreeNode(20, treeNode15, treeNode7);

        int depth = minimumDepthBinaryTree.minDepth(root);
        System.out.println(depth);

    }
}