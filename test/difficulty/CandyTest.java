package difficulty;

import main.difficulty.Candy;
import org.junit.jupiter.api.Test;

class CandyTest {

    @Test
    void candy() {
        Candy candy = new Candy();
        System.out.println(candy.candy(new int[]{1, 3, 2, 2, 1}));
    }
}