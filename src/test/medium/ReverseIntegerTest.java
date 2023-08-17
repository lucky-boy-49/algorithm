package test.medium;

import main.medium.ReverseInteger;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    @Test
    void reverse() {
        System.out.println(new ReverseInteger().reverse2(-2147483648));
    }
}