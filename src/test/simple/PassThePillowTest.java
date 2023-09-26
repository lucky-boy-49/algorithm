package test.simple;

import main.simple.PassThePillow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/26 20:20
 * @description
 */
class PassThePillowTest {

    @Test
    void passThePillow() {
        PassThePillow pp = new PassThePillow();
        System.out.println(pp.passThePillow(3, 2));
    }
}