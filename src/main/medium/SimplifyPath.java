package main.medium;

import java.util.Stack;

/**
 * 71. 简化路径
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/+");
        StringBuilder res = new StringBuilder();
        for (String s : split) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.isEmpty()) {
                stack.push(s);
            }
        }
        res.append("/");
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                res.insert(0, "/" + stack.pop());
            }
            res.deleteCharAt(res.length() - 1);
        }
        return res.toString();
    }

}
