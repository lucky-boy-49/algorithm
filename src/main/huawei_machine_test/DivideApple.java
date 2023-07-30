package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0086-分苹果
 * AB两个人把苹果分为两堆
 * A希望按照他的计算规则等分苹果
 * 他的计算规则是按照二级制加法计算
 * 并且不计算进位12+5=9(1100+0101=9),
 * B的计算规则是十进制加法,
 * 包括正常进位,B希望在满足A的情况下获取苹果重量最多
 * 输入苹果的数量和每个苹果重量
 * 输出满足A的情况下B获取的苹果总重量
 * 如果无法满足A的要求 输出-1
 * 数据范围：
 * 1 <= 苹果数量 <= 20000
 * 1 <= 每个苹果重量 <= 10000
 */
public class DivideApple {

    public static void solution(String line) {
        String[] s = line.split(" ");
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(ints);

        int max = -1;
        for (int i = 1; i < ints.length - 1; i++) {
            int sumBin1 = 0;
            int sumBin2 = 0;
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < i; j++) {
                sumBin1 = sumBin1 ^ ints[j];
                sum1 += ints[j];
            }

            for (int j = i; j < ints.length; j++) {
                sumBin2 = sumBin2 ^ ints[j];
                sum2 += ints[j];
            }

            if (sumBin1 == sumBin2) {
                max = Math.max(Math.max(sum1, sum2), max);
            }

        }

        System.out.println(max);

    }

}
