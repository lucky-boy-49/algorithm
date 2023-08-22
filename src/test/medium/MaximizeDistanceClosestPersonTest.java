package test.medium;

import main.medium.MaximizeDistanceClosestPerson;
import org.junit.jupiter.api.Test;

class MaximizeDistanceClosestPersonTest {

    @Test
    void maxDistToClosest() {

        MaximizeDistanceClosestPerson mdc = new MaximizeDistanceClosestPerson();
        System.out.println(mdc.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        System.out.println(mdc.maxDistToClosest2(new int[]{1, 0, 0, 0, 1, 0, 1}));

    }
}