package main.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        int m = matrix.length, n = matrix[0].length, flag = 0;
        boolean[][] v = new boolean[m][n];
        int i = 0, j = 0;
        while (i < m && i > -1 && j > -1 && j < n && !v[i][j]) {
            result.add(matrix[i][j]);
            v[i][j] = true;
            if (flag == 0) {
                if (j + 1 == n || v[i][j + 1]) {
                    flag = 1;
                    i++;
                } else {
                    j++;
                }
            } else if (flag == 1) {
                if (i + 1 == m || v[i + 1][j]) {
                    flag = 2;
                    j--;
                } else {
                    i++;
                }
            } else if (flag == 2) {
                if (j - 1 == -1 || v[i][j - 1]) {
                    flag = 3;
                    i--;
                } else {
                    j--;
                }
            } else {
                if (i - 1 == -1 || v[i - 1][j]) {
                    flag = 0;
                    j++;
                } else {
                    i--;
                }
            }
        }
        return result;
    }

}
