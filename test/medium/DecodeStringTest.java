package medium;

import main.medium.DecodeString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void decodeString() {
        DecodeString decodeString = new DecodeString();
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString.decodeString(s));
    }
}