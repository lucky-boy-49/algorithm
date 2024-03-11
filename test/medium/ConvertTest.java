package medium;

import main.medium.Convert;
import org.junit.jupiter.api.Test;

class ConvertTest {

    @Test
    void convert() {
        System.out.println(new Convert().convert("PAYPALISHIRING", 3));
    }
}