package medium;

import main.medium.GasStation;
import org.junit.jupiter.api.Test;

class GasStationTest {

    @Test
    void canCompleteCircuit() {
        GasStation g = new GasStation();
        System.out.println(g.canCompleteCircuit(new int[]{4, 5, 2, 6, 5, 3}, new int[]{3, 2, 7, 3, 2, 9}));
    }
}