package medium;

import main.medium.BestTimeBuySellStockII;
import org.junit.jupiter.api.Test;

class BestTimeBuySellStockIITest {

    @Test
    void maxProfit() {
        BestTimeBuySellStockII b = new BestTimeBuySellStockII();
        System.out.println(b.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}