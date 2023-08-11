package test.simple;

import main.simple.DiagonalSum;
import org.junit.jupiter.api.Test;

class DiagonalSumTest {

    @Test
    void solution() {
        System.out.println(new DiagonalSum().solution(new int[][]{{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}}));
    }
}