package main.simple;

/**
 * 1572. 矩阵对角线元素的和
 */
public class DiagonalSum {

    public int solution(int[][] mat) {
        int j = mat.length - 1, res = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == j - i) {
                res += mat[i][i];
            } else {
                res += mat[i][i] + mat[i][j - i];
            }
        }
        return res;
    }

}
