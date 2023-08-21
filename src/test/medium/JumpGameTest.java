package test.medium;

import main.medium.JumpGame;
import org.junit.jupiter.api.Test;

class JumpGameTest {

    @Test
    void canJump() {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));
    }
}