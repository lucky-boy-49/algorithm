package test.simple;

import main.simple.FindCenterSubscriptArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCenterSubscriptArrayTest {

    @Test
    void pivotIndex() {
        FindCenterSubscriptArray array = new FindCenterSubscriptArray();
        int[] nums = {1, 7, 3, 6, 5, 6};

        int i = array.pivotIndex(nums);
        System.out.println(i);

    }
}