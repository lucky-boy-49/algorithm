package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 矩阵稀疏扫描
 */
public class MatrixSparseScan {

    public static void solution(int[][] sparse) {
        int[] line = new int[sparse.length];
        int[] row = new int[sparse[0].length];
        int lineLen = sparse.length / 2;
        int rowLen = sparse[0].length / 2;
        for (int i = 0; i < sparse.length; i++) {
            for (int j = 0; j < sparse[i].length; j++) {
                if (sparse[i][j] == 0) {
                    line[i]++;
                    row[j]++;
                }
            }
        }
        long lineSum = Arrays.stream(line).filter(s -> s > rowLen).count();
        long rowSum = Arrays.stream(row).filter(s -> s > lineLen).count();
        System.out.println(lineSum);
        System.out.println(rowSum);
    }

}
