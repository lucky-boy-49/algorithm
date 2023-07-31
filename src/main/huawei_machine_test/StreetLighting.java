package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0093-路灯照明
 * 在一条笔直的公路上安装了N个路灯，
 * 从位置0开始安装，路灯之间间距固定为100米
 * 每个路灯都有自己的照明半径
 * 请计算第一个路灯和最后一个路灯之间，
 * 无法照明的区间的长度和。
 */
public class StreetLighting {

    public static void solution(int sum, String lights) {
        int[] split = Arrays.stream(lights.split(" ")).mapToInt(Integer::parseInt).toArray();
        int res = 0;
        for (int i = 1; i < sum; i++) {
            if (split[i] + split[i - 1] < 100) {
                res += 100 - split[i] - split[i - 1];
            }
        }
        System.out.println(res);
    }

    public static void solution2(String lights) {

        int[] ints = Arrays.stream(lights.split(" ")).mapToInt(Integer::parseInt).toArray();

        byte[] bytes = new byte[(ints.length - 1) * 100];

        for (int i = 0; i < ints.length; i++) {
            int pos = i * 100;
            int left = Math.max(pos - ints[i], 0);
            int right = Math.min(pos + ints[i], bytes.length);

            for (int k = left; k < right; k++) {
                bytes[k] = 1;
            }
        }

        int count = 0;
        for (byte b : bytes) {
            if (b == 0) count++;
        }
        System.out.println(count);

    }

}
