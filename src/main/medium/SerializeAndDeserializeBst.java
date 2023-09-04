package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/4 21:04
 * @description 449. 序列化和反序列化二叉搜索树
 */
public class SerializeAndDeserializeBst {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + "," +
                serialize(root.left) + "," +
                serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(split));
        return dfs(list);
    }

    private TreeNode dfs(List<String> list) {
        String s = list.get(0);
        if ("#".equals(s)) {
            list.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        list.remove(0);
        node.left = dfs(list);
        node.right = dfs(list);
        return node;
    }

}
