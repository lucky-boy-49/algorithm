package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * 题目0001-勾股数
 * 题目描述
 * 如果三个正整数A、B、C ，A² + B² = C² 则为勾股数，
 * 如果ABC之间两两互质，即A与B，A与C，B与C均互质没有公约数，则称其为勾股数元组。
 * 请求出给定 n ~ m 范围内所有的勾股数元组。
 * 输入描述
 * 起始范围
 * 1 < n < 10000
 * n < m < 10000
 * 输出描述
 * ABC保证A < B < C
 * 输出格式A B C
 * 多组勾股数元组，按照A B C升序的排序方式输出。
 * 若给定范围内，找不到勾股数元组时，输出Na。
 */
public class PythagoreanNumber {

    public static void solution(int start, int end) {
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                for (int k = j + 1; k < end; k++) {
                    if (i < j && j < k) {
                        if (i * i + j * j == k * k) {
                            boolean coprime1 = isCoprime(i, j);
                            boolean coprime2 = isCoprime(i, k);
                            boolean coprime3 = isCoprime(k, j);
                            if (coprime1 && coprime2 && coprime3) {
                                int[] ints = new int[]{
                                        i, j, k
                                };
                                list.add(ints);
                            }
                        }
                    }
                }
            }
        }
        list.forEach(a -> {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        });
    }

    private static boolean isCoprime(double num1, double num2) {
        int minLen = (int) Math.min(num1, num2), min = 1;
        for (int i = 1; i <= minLen; i++) {
            if (num1 / i == (double) ((int) num1 / i) && num2 / i == (double) ((int) num2 / i)) {
                min = Math.max(min, i);
            }
        }
        return min == 1;
    }

}
