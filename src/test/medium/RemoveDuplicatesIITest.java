package test.medium;

import main.medium.RemoveDuplicatesII;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesIITest {

    @Test
    void removeDuplicates() {

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicatesII removeDuplicatesII = new RemoveDuplicatesII();
        System.out.println(removeDuplicatesII.removeDuplicates(nums));

    }
}