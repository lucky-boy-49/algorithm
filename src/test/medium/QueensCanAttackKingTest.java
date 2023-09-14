package test.medium;

import main.medium.QueensCanAttackKing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/14 09:59
 * @description
 */
class QueensCanAttackKingTest {

    @Test
    void queensAttacktheKing() {
        int[][] ints = {
                {5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3}, {4, 0}, {1, 2}, {6, 3}, {5, 0}, {0, 4}, {2, 2}, {1, 1}, {6, 4}, {5, 4},
                {0, 0}, {2, 6}, {4, 5}, {5, 2}, {1, 4}, {7, 5}, {2, 3}, {0, 5}, {4, 2}, {1, 0}, {2, 7}, {0, 1}, {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}
        };
        QueensCanAttackKing q = new QueensCanAttackKing();
        q.queensAttacktheKing(ints, new int[] {3, 4});
    }
}