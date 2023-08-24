package test.simple;

import main.simple.ValidPalindrome;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("0P"));
    }
}