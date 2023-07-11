package test.medium;

import main.medium.PredictWinner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredictWinnerTest {

    @Test
    void predictTheWinner() {
        PredictWinner predictWinner = new PredictWinner();
        int[] nums = new int[] {1, 5, 2};
        boolean b = predictWinner.PredictTheWinner(nums);
        System.out.println(b);
    }
}