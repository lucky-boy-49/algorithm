package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 构成的正方形数量
 * 题目描述
 * 输入N个互不相同的二维整数坐标, 求这N个坐标可以构成的正方形数量。(内积为零的两个向量垂直)
 * 输入描述
 * 第一行输入为 N，N 代表坐标数量，N为正整数。N <= 100
 * 之后的 K 行输入为坐标 x y以空格分隔，x, y 为整数, -10 <= x, y <= 10
 * 输出描述
 * 输出可以构成的正方形数量
 */
public class NumberSquaresFormed {

    public static void solution(int n, String[] w) {
        if (n < 4) {
            System.out.println(0);
            return;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int[] w1 = Arrays.stream(w[i].split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        int[] w2 = Arrays.stream(w[j].split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        int[] w3 = Arrays.stream(w[k].split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        int[] w4 = Arrays.stream(w[l].split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        double length1 = getLength(w1, w2);
                        double length2 = getLength(w2, w3);
                        double length3 = getLength(w3, w4);
                        double length4 = getLength(w4, w1);
                        if (length1 == length2 && length2 == length3 && length3 == length4 && length4 == length1) {
                            res++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }

    private static double getLength(int[] w1, int[] w2) {
        return Math.sqrt(
                Math.pow((w2[0] - w1[0]), 2) + Math.pow((w2[1] - w1[1]), 2)
        );
    }

}
