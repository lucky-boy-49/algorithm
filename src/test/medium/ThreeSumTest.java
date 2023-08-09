package test.medium;

import main.medium.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {

    @Test
    void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        for (List<Integer> integers : new ThreeSum().threeSum(nums)) {
            integers.forEach(System.out::print);
            System.out.println();
        }

    }
}