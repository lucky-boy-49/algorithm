package medium;

import main.medium.RemoveElement;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void solution() {
        int[] nums = {3, 2, 2, 3};
        System.out.println(new RemoveElement().solution(nums, 3));
    }
}