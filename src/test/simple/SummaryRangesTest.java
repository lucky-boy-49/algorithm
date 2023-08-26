package test.simple;

import main.simple.SummaryRanges;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SummaryRangesTest {

    @Test
    void summaryRanges() {
        SummaryRanges sr = new SummaryRanges();
        List<String> list = sr.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println(Arrays.toString(list.toArray(String[]::new)));
    }
}