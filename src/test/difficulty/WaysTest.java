package test.difficulty;

import main.difficulty.Ways;
import org.junit.jupiter.api.Test;

class WaysTest {

    @Test
    void ways() {
        Ways ways = new Ways();
        System.out.println(ways.ways(new String[]{"A..", "AAA", "..."}, 3));
    }
}