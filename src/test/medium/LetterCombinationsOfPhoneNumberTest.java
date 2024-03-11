package test.medium;

import main.medium.LetterCombinationsOfPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfPhoneNumberTest {

    @Test
    void letterCombinations() {
        LetterCombinationsOfPhoneNumber lcopn = new LetterCombinationsOfPhoneNumber();
        System.out.println(lcopn.letterCombinations(""));
    }
}