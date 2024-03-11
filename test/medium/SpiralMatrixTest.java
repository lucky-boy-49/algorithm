package medium;

import main.medium.SpiralMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SpiralMatrixTest {

    @Test
    void spiralOrder() {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(sm.spiralOrder(matrix).toArray()));
    }
}