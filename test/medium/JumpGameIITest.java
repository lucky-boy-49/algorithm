package medium;

import main.medium.JumpGameII;
import org.junit.jupiter.api.Test;

class JumpGameIITest {

    @Test
    void jump() {
        JumpGameII j = new JumpGameII();
        System.out.println(j.jump(new int[]{2, 3, 1, 1, 4}));
    }
}