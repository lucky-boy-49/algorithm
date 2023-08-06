package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 计算最接近的数
 */
public class CalculateClosestNumber {

    public static void solution(String line) {
        String[] split = line.split(",");
        int[] ints1 = new int[split.length - 1];
        int[] x = new int[split.length - 1];
        int k = 0;
        for (int i = 0; i < split.length; i++) {
            String s = split[i].replaceAll("[\\[\\]]", "");
            if (i == split.length - 1) {
                k = Integer.parseInt(s);
            } else {
                ints1[i] = Integer.parseInt(s);
                x[i] = Integer.parseInt(s);
            }
        }
        Arrays.sort(ints1);
        int length = ints1.length / 2;
        int a = ints1[length];

        int i = -1, v = Integer.MAX_VALUE;
        for (int j = 0; j + k - 1 < ints1.length; j++) {
            int cur = 0;
            for (int l = j; l <= j + k - 1; l++) {
                cur += x[l];
            }
            int abs = Math.abs(cur - a);
            if (abs <= v) {
                i = j;
                v = abs;
            }
        }
        System.out.println(i);
    }

}
