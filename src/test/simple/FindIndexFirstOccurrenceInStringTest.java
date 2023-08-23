package test.simple;

import main.simple.FindIndexFirstOccurrenceInString;
import org.junit.jupiter.api.Test;

class FindIndexFirstOccurrenceInStringTest {

    @Test
    void strStr() {
        FindIndexFirstOccurrenceInString f = new FindIndexFirstOccurrenceInString();
        System.out.println(f.strStr("leetcode", "qwerqwr"));
    }
}