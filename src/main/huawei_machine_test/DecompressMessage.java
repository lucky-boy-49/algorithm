package main.huawei_machine_test;

import java.util.Stack;

/**
 * 解压报文
 * 压缩报文还原
 * 题目描述
 * 为了提升数据传输的效率，会对传输的报文进行压缩处理。
 * 输入一个压缩后的报文，请返回它解压后的原始报文。
 * 压缩规则：n[str]，表示方括号内部的 str 正好重复 n 次。
 * 注意 n 为正整数（0 < n <= 100），str只包含小写英文字母，不考虑异常情况。
 * 注：
 * 1）原始报文长度不会超过1000，不考虑异常的情况
 * 输入描述
 * 输入描述:
 * 输入压缩后的报文：
 * 1）不考虑无效的输入，报文没有额外的空格，方括号总是符合格式要求的；
 * 2）原始报文不包含数字，所有的数字只表示重复的次数 n ，例如不会出现像5b或3[8]的输入；
 * 输出描述
 * 输出描述:
 * 解压后的原始报文
 */
public class DecompressMessage {

    public static void solution(String line) {

        Stack<String> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c != ']') {
                stack.push(String.valueOf(c));
            } else {
                StringBuilder builder = new StringBuilder();
                String cur = stack.pop();
                while (!cur.equals("[")) {
                    builder.append(cur);
                    cur = stack.pop();
                }
                builder.reverse();
                int n = Integer.parseInt(stack.pop());
                String res = builder.toString().repeat(n);
                stack.push(res);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        System.out.println(res);
    }

}
