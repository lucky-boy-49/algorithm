package main.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/21 22:00
 * @description
 */
class CollectCoinsInTreeTest {

    @Test
    void collectTheCoins() {
        int[] coins = new int[] {
                1,0,0,0,0,1
        };
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{4,5}};
        CollectCoinsInTree cct = new CollectCoinsInTree();
        System.out.println(cct.collectTheCoins(coins, edges));
    }
}