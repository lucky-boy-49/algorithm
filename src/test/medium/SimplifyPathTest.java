package test.medium;

import main.medium.SimplifyPath;
import org.junit.jupiter.api.Test;

class SimplifyPathTest {

    @Test
    void simplifyPath() {
        SimplifyPath sp = new SimplifyPath();
        String s = sp.simplifyPath("/home//foo/");
        System.out.println(s);
    }
}