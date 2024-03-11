package medium;

import main.medium.HouseRobber2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber2Test {

    @Test
    void rob() {
        HouseRobber2 houseRobber2 = new HouseRobber2();
        int rob = houseRobber2.rob(new int[]{1, 2, 3, 1});
        System.out.println(rob);
    }
}