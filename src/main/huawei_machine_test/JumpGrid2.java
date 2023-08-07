package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 跳格子2
 */
public class JumpGrid2 {

    public static void solution(String line) {
        int[] split = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int length = split.length, res = 0;
        for (int i = 0; i < length; i++) {
            int cur = split[i] + check(i + 2, split, i);
            res = Math.max(res, cur);
        }
        System.out.println(res);
    }

    private static int check(int start, int[] split, int j) {
        int i = start % split.length;
        if (i == j || (i + 1) % split.length == j) {
            return 0;
        }
        return split[i] + check(i + 2, split, j);
    }

}
