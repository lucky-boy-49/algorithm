package test.difficulty;

import main.difficulty.BasicCalculator;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

    @Test
    void calculate() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}