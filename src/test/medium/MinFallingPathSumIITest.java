package test.medium;

import main.difficulty.MinFallingPathSumII;
import org.junit.jupiter.api.Test;

class MinFallingPathSumIITest {

    @Test
    void solution() {
        int[][] grid = {{-73, 61, 43, -48, -36}, {3, 30, 27, 57, 10}, {96, -76, 84, 59, -15}, {5, -49, 76, 31, -7}, {97, 91, 61, -46, 67}};
        System.out.println(new MinFallingPathSumII().solution(grid));
        System.out.println(new MinFallingPathSumII().solution2(grid));
    }
}