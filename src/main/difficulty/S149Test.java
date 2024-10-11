package main.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S149Test {

    @Test
    void maxPoints() {
        S149 s149 = new S149();
        assertEquals(1, s149.maxPoints(new int[][]{{0, 0}}));
    }
}