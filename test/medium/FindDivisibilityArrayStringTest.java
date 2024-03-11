package medium;

import main.medium.FindDivisibilityArrayString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindDivisibilityArrayStringTest {

    @Test
    void divisibilityArray() {

        FindDivisibilityArrayString fdas = new FindDivisibilityArrayString();
        Arrays.stream(fdas.divisibilityArray("4868438856666666", 6)).forEach(System.out::println);

    }
}