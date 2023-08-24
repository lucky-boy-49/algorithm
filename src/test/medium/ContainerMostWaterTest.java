package test.medium;

import main.medium.ContainerMostWater;
import org.junit.jupiter.api.Test;

class ContainerMostWaterTest {

    @Test
    void maxArea() {
        ContainerMostWater c = new ContainerMostWater();
        System.out.println(c.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}