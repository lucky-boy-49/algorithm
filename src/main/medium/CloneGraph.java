package main.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HJ
 * @date 2023/9/7 10:34
 * @description 133. 克隆图
 */
public class CloneGraph {

    Map<Node2, Node2> map = new HashMap<>();

    public Node2 cloneGraph(Node2 node) {
        Node2 root = new Node2(node.val, new ArrayList<>());
        map.put(node, root);
        for (Node2 neighbor : node.neighbors) {
            if (map.containsKey(neighbor)) {
                root.neighbors.add(map.get(neighbor));
            } else {
                Node2 node2 = cloneGraph(neighbor);
                root.neighbors.add(node2);
            }
        }
        return root;
    }

}
