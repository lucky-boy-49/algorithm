package test.simple;

import main.simple.MaximumEnemyFortsThatCanBeCaptured;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/2 09:05
 * @description
 */
class MaximumEnemyFortsThatCanBeCapturedTest {

    @Test
    void captureForts() {
        MaximumEnemyFortsThatCanBeCaptured meftcbc = new MaximumEnemyFortsThatCanBeCaptured();
        System.out.println(meftcbc.captureForts(new int[]{1,0,0,-1}));
    }
}