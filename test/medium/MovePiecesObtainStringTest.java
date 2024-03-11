package medium;

import main.medium.MovePiecesObtainString;
import org.junit.jupiter.api.Test;

class MovePiecesObtainStringTest {

    @Test
    void canChange() {
        MovePiecesObtainString movePiecesObtainString = new MovePiecesObtainString();
        System.out.println(movePiecesObtainString.canChange("_L__R__R_", "L______RR"));
    }
}