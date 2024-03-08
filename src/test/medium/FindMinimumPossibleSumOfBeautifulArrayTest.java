package test.medium;

import main.medium.FindMinimumPossibleSumOfBeautifulArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumPossibleSumOfBeautifulArrayTest {

    @Test
    void minimumPossibleSum() {
        FindMinimumPossibleSumOfBeautifulArray fmpsba = new FindMinimumPossibleSumOfBeautifulArray();
        System.out.println(fmpsba.minimumPossibleSum(16, 6));
    }
}