package test.difficulty;

import main.difficulty.FullJustify;
import org.junit.jupiter.api.Test;

class FullJustifyTest {

    @Test
    void fullJustify() {
        FullJustify fullJustify = new FullJustify();
        System.out.println(fullJustify.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }
}