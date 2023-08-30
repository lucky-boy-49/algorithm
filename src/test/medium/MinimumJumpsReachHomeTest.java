package test.medium;

import main.medium.MinimumJumpsReachHome;
import org.junit.jupiter.api.Test;

class MinimumJumpsReachHomeTest {

    @Test
    void minimumJumps() {
        MinimumJumpsReachHome mjr = new MinimumJumpsReachHome();
        int[] forbidden = {
                14, 4, 18, 1, 15
        };
        System.out.println(mjr.minimumJumps(forbidden, 3, 15, 9));
    }
}