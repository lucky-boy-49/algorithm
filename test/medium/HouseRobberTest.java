package medium;

import main.medium.HouseRobber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void rob() {
        HouseRobber houseRobber = new HouseRobber();
        int rob = houseRobber.rob(new int[]{1, 2, 3, 1});
        System.out.println(rob);
    }
}