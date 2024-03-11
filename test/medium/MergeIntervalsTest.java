package medium;

import main.medium.MergeIntervals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeIntervalsTest {

    @Test
    void merge() {
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 17}};
        System.out.println(Arrays.deepToString(mi.merge(intervals)));
    }
}