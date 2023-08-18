package test.difficulty;

import main.difficulty.IsMatch;
import org.junit.jupiter.api.Test;

class IsMatchTest {

    @Test
    void isMatch() {

        System.out.println(new IsMatch().isMatch("aa", "a*"));

    }
}