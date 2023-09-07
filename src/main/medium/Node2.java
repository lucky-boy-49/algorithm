package main.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/7 10:35
 * @description
 */
public class Node2 {

    public int val;
    public List<Node2> neighbors;
    public Node2() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node2(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
    public Node2(int val, ArrayList<Node2> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node2 o) {
            return this.val == o.val;
        } else {
            return false;
        }
    }
}
