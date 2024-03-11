package medium;

import main.medium.ChampagneTower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampagneTowerTest {

    @Test
    void champagneTower() {
        ChampagneTower champagneTower = new ChampagneTower();
        double v = champagneTower.champagneTower(1000000000, 99, 99);
        System.out.println(v);
        v = champagneTower.champagneTower2(1000000000, 99, 99);
        System.out.println(v);
    }
}