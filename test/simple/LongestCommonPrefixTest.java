package simple;

import main.simple.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }
}