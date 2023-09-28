package test.difficulty;

import main.difficulty.NumberFlowersFullBloom;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author HJ
 * @date 2023/9/28 21:07
 * @description
 */
class NumberFlowersFullBloomTest {

    @Test
    void fullBloomFlowers() {
        int[][] flowers = new int[][] {
                {1, 6}, {3, 7}, {9, 12}, {4, 13}
        };
        int[] people = new int[] {
            2, 3, 7, 11
        };
        NumberFlowersFullBloom nff = new NumberFlowersFullBloom();
        System.out.println(Arrays.toString(nff.fullBloomFlowers(flowers, people)));
    }
}