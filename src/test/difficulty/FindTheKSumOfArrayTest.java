package test.difficulty;

import main.difficulty.FindTheKSumOfArray;
import org.junit.jupiter.api.Test;

class FindTheKSumOfArrayTest {

    @Test
    void kSum() {
        FindTheKSumOfArray ftksoa = new FindTheKSumOfArray();
        System.out.println(ftksoa.kSum(new int[]{1, -2, 3, 4, -10, 12}, 16));
    }
}