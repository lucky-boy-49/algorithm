package test.medium;

import main.medium.LongestPalindrome;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {

    @Test
    void solution() {
        String s = "bb";
        System.out.println(new LongestPalindrome().solution(s));
    }
}