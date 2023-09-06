package test.medium;

import main.medium.NumberIslands;
import org.junit.jupiter.api.Test;

/**
 * @author HJ
 * @date 2023/9/6 10:18
 * @description
 */
class NumberIslandsTest {

    @Test
    void numIslands() {
        char[][] grid = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberIslands islands = new NumberIslands();
        System.out.println(islands.numIslands(grid));
    }
}