package medium;

import main.medium.HIndex;
import org.junit.jupiter.api.Test;

class HIndexTest {

    @Test
    void hIndex() {
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
    }
}