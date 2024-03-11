package medium;

import main.medium.ValidTicTacToeState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTicTacToeStateTest {

    @Test
    void validTicTacToe() {
        ValidTicTacToeState validTicTacToeState = new ValidTicTacToeState();
        boolean b = validTicTacToeState.validTicTacToe(new String[]{"XOX", " X ", "   "});
        System.out.println(b);
    }
}