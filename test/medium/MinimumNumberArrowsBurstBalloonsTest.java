package medium;

import main.medium.MinimumNumberArrowsBurstBalloons;
import org.junit.jupiter.api.Test;

class MinimumNumberArrowsBurstBalloonsTest {

    @Test
    void findMinArrowShots() {
        MinimumNumberArrowsBurstBalloons muabb = new MinimumNumberArrowsBurstBalloons();
        int[][] ints = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(muabb.findMinArrowShots(ints));
    }

    @Test
    void findMinArrowShotsII() {
        MinimumNumberArrowsBurstBalloons muabb = new MinimumNumberArrowsBurstBalloons();
        int[][] ints = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(muabb.findMinArrowShotsII(ints));
    }
}