package main.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/14 09:15
 * @description 1222. 可以攻击国王的皇后
 */
public class QueensCanAttackKing {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int i = king[0];
        int j = king[1];
        List<List<Integer>> res = new LinkedList<>();
        List<List<int[]>> list = new LinkedList<>();
        for (int k = 0; k < 8; k++) {
            list.add(new LinkedList<>());
        }
        for (int[] queen : queens) {
            int i2 = queen[0];
            int j2 = queen[1];
            if (j2 - j == i2 - i) {
                if (j2 - j < 0) {
                    list.get(0).add(new int[]{i2, j2});
                } else if (j2 - j > 0) {
                    list.get(4).add(new int[]{i2, j2});
                }
            } else if (j2 == j) {
                if (i2 < i) {
                    list.get(1).add(new int[]{i2, j2});
                } else if (i2 > i) {
                    list.get(5).add(new int[]{i2, j2});
                }
            } else if (i2 == i) {
                if (j2 < j) {
                    list.get(7).add(new int[]{i2, j2});
                } else {
                    list.get(3).add(new int[]{i2, j2});
                }
            } else if (j2 - j == -(i2 - i)) {
                if (i2 - i < 0 && j2 - j > 0) {
                    list.get(2).add(new int[]{i2, j2});
                } else if (i2 - i > 0 && j2 - j < 0) {
                    list.get(6).add(new int[]{i2, j2});
                }
            }
        }
        for (List<int[]> ints : list) {
            if (!ints.isEmpty()) {
                ints.sort((a, b) -> {
                    int i1 = a[0] - i;
                    int j2 = a[1] - j;
                    double sqrt1 = Math.sqrt(i1 * i1 + j2 * j2);
                    i1 = b[0] - i;
                    j2 = b[1] - j;
                    double sqrt2 = Math.sqrt(i1 * i1 + j2 * j2);
                    return (int) (sqrt1 - sqrt2);
                });
                ArrayList<Integer> integers = new ArrayList<>();
                int[] ints1 = ints.get(0);
                integers.add(ints1[0]);
                integers.add(ints1[1]);
                res.add(integers);
            }
        }
        return res;
    }

}
