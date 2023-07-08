package main.simple;

import java.util.Arrays;

/**
 * @author HJ
 * 566. 重塑矩阵
 */
public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // 自己
//        if (mat.length * mat[0].length != r * c) {
//            return mat;
//        }
//        int[][] result = new int[r][c];
//        int k = 0, g = 0;
//        for(int i = 0; i < mat.length; i++) {
//            for(int j = 0; j < mat[i].length; j++) {
//                result[k][g++] = mat[i][j];
//                if (g > c-1) {
//                    g = 0;
//                    k++;
//                }
//            }
//        }
//        return result;

        // 官方
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < m * n; ++i) {
            result[i / c][i % c] = mat[i / n][i % n];
        }
        return result;

    }

    public static void main(String[] args){
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 4, c = 1;
        int[][] result = reshapeMatrix.matrixReshape(mat, r, c);
        Arrays.stream(result).forEach(System.out::println);
    }

}