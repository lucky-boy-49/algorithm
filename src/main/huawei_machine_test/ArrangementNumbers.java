package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * 数字反转打印
 * 题目0126-数字的排列
 * 页面内容
 * 讨论
 * 最后编辑
 * Amos
 * 09/17/2022
 * 数字的排列
 * 题目描述
 * 小华是个很有对数字很敏感的小朋友，
 * 他觉得数字的不同排列方式有特殊的美感。
 * 某天，小华突发奇想，如果数字多行排列，
 * 第一行1个数，
 * 第二行2个，
 * 第三行3个，
 * 即第n行n个数字，并且奇数行正序排列，
 * 偶数行逆序排列，数字依次累加。
 * 这样排列的数字一定很有意思，请帮小华实现。
 * 规则总结如下：
 * 每个数字占据4个位置，不足四位用*补位，如1打印为1***
 * 数字之间相邻4空格
 * 数字的打印顺序按照正序逆序交替打印，奇数行正序，偶数行逆序
 * 最后一行数字顶格，第n-1行相对第n行缩进四个空格
 * 输入描述
 * 第一行输入为N，表示打印多少行，1 <= N <= 30
 */
public class ArrangementNumbers {

    public static void solution(int n) {
        LinkedList<String> res = new LinkedList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append("    ".repeat(n - i));
            if (i % 2 == 0) {
                int t = i + j;
                j = t + 1;
                for (int k = t; k > t - i; k--) {
                    int length = 4 - String.valueOf(k).length();
                    builder.append(k).append("*".repeat(length)).append("    ");
                }
            } else {
                for (int k = 0; k < i; k++) {
                    j++;
                    int length = 4 - String.valueOf(j).length();
                    builder.append(j).append("*".repeat(length)).append("    ");
                }
            }
            res.add(builder.toString());
        }
        res.forEach(System.out::println);
    }

}
