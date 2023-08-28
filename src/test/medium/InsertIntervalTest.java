package test.medium;

import main.medium.InsertInterval;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertIntervalTest {

    @Test
    void insert() {
        InsertInterval insertInterval = new InsertInterval();
        int[][] ints = {{1, 5}};
        int[][] insert = insertInterval.insert(ints, new int[]{1, 7});
        System.out.println(Arrays.deepToString(insert));
    }
}