package test.medium;

import main.medium.FindMinimumPossibleSumOfBeautifulArray;
import org.junit.jupiter.api.Test;

class FindMinimumPossibleSumOfBeautifulArrayTest {

    @Test
    void minimumPossibleSum() {
        FindMinimumPossibleSumOfBeautifulArray fmpsba = new FindMinimumPossibleSumOfBeautifulArray();
        System.out.println(fmpsba.minimumPossibleSum(39636, 49035));
    }
}