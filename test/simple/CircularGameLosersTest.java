package simple;

import main.simple.CircularGameLosers;
import org.junit.jupiter.api.Test;

class CircularGameLosersTest {

    @Test
    void circularGameLosers() {
        int[] ints = new CircularGameLosers().circularGameLosers(1, 1);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}