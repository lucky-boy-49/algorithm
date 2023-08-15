package test.medium;

import main.medium.FindReplaceString;
import org.junit.jupiter.api.Test;

class FindReplaceStringTest {

    @Test
    void findReplaceString() {
        FindReplaceString findReplaceString = new FindReplaceString();
        String s = "vmokgggqzp";
        int[] indices = {3, 5, 1};
        String[] sources = {"kg", "ggq", "mo"}, targets = {"s", "so", "bfr"};
        System.out.println(findReplaceString.findReplaceString(s, indices, sources, targets));
    }
}