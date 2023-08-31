package test.difficulty;

import main.difficulty.MinTrioDegree;
import org.junit.jupiter.api.Test;

class MinTrioDegreeTest {

    @Test
    void minTrioDegree() {
        int[][] edges = {{1, 2}, {1, 3}, {3, 2}, {4, 1}, {5, 2}, {3, 6}};
        MinTrioDegree minTrioDegree = new MinTrioDegree();
        System.out.println(minTrioDegree.minTrioDegree(6, edges));
    }
}