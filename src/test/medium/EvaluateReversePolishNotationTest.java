package test.medium;

import main.medium.EvaluateReversePolishNotation;
import org.junit.jupiter.api.Test;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN() {
        EvaluateReversePolishNotation erpn = new EvaluateReversePolishNotation();
        System.out.println(erpn.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}