package test.simple;

import main.simple.HappyNumber;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(2));
    }
}