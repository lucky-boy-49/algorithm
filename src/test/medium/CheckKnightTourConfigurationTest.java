package test.medium;

import main.medium.CheckKnightTourConfiguration;
import org.junit.jupiter.api.Test;

/**
 * @author HJ
 * @date 2023/9/13 21:44
 * @description
 */
class CheckKnightTourConfigurationTest {

    @Test
    void checkValidGrid() {
        int[][] grid = new int[][] {
                {8,3,6},{5,0,1},{2,7,4}
        };
        CheckKnightTourConfiguration c = new CheckKnightTourConfiguration();
        System.out.println(c.checkValidGrid(grid));
    }
}