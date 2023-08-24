package test.medium;

import main.medium.CountServersCommunicate;
import org.junit.jupiter.api.Test;

class CountServersCommunicateTest {

    @Test
    void countServers() {
        System.out.println(new CountServersCommunicate().countServers(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}