package main.medium;

/**
 * 48. 旋转图像
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            for (int i = layer; i < n - layer - 1; i++) {
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[n - i - 1][layer];
                matrix[n - i - 1][layer] = matrix[n - layer - 1][n - i - 1];
                matrix[n - layer - 1][n - i - 1] = matrix[i][n - layer - 1];
                matrix[i][n - layer - 1] = temp;
            }
        }
    }

}
