package main.huawei_machine_test;

import java.util.LinkedList;
import java.util.List;

/**
 * 字符串加密
 * 题目描述
 * 给你一串未加密的字符串str，
 * 通过对字符串的每一个字母进行改变来实现加密，
 * 加密方式是在每一个字母str[i]偏移特定数组元素a[i]的量，
 * 数组a前三位已经赋值：a[0]=1,a[1]=2,a[2]=4。
 * 当i>=3时，数组元素a[i]=a[i-1]+a[i-2]+a[i-3]，
 * 例如：原文 abcde 加密后 bdgkr，其中偏移量分别是1,2,4,7,13。
 * 输入描述
 * 第一行为一个整数n（1 <= n <= 1000），
 * 表示有n组测试数据，每组数据包含一行，
 * 原文str（只含有小写字母， 0 < 长度 <= 50）。
 * 输出描述
 * 每组测试数据输出一行，表示字符串的密文
 */
public class StringEncryption {

    public static void solution(int n, String[] str) {
        if (n < 1 || n > 1000) {
            return;
        }
        if (n != str.length) {
            return;
        }

        List<String> res = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            char[] chars = str[i].toCharArray();
            int first = 1, second = 2, three = 4;
            for (int j = 0; j < chars.length; j++) {
                if (j == 0) {
                    char c = (char) ((chars[j] - 'a' + first) % 26 + 'a');
                    builder.append(c);
                } else if (j == 1) {
                    char c = (char) ((chars[j] - 'a' + second) % 26 + 'a');
                    builder.append(c);
                } else if (j == 2) {
                    char c = (char) ((chars[j] - 'a' + three) % 26 + 'a');
                    builder.append(c);
                } else {
                    int tmp = first + second + three;
                    char c = (char) ((chars[j] - 'a' + tmp) % 26 + 'a');
                    builder.append(c);
                    first = second;
                    second = three;
                    three = tmp;
                }
            }
            res.add(builder.toString());
        }

        res.forEach(System.out::println);

    }

}
