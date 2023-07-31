package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0079-卡片组成的最大数字
 * 小组中每位都有一张卡片
 * 卡片是6位以内的正整数
 * 将卡片连起来可以组成多种数字
 * 计算组成的最大数字
 */
public class LargestNumberOfCards {

    public static void solution(String line) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(line.split(",")).sorted((s1, s2) -> {
            char[] v1 = s1.toCharArray();
            char[] v2 = s2.toCharArray();
            int len1 = v1.length;
            int len2 = v2.length;

            if (len1 == len2) {
                return s2.compareTo(s1);
            }

            int min = Math.min(len1, len2);

            for (int i = 0; i < min; i++) {
                char c1 = v1[i];
                char c2 = v2[i];
                if (c1 != c2) {
                    return c2 - c1;
                }
            }

            if (len1 > len2) {
                return v1[0] - v1[min];
            } else {
                return v2[min] - v2[0];
            }

        }).forEach(builder::append);
        System.out.println(builder);
    }


}
