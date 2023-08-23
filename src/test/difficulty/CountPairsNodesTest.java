package test.difficulty;

import main.difficulty.CountPairsNodes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CountPairsNodesTest {

    @Test
    void countPairs() {
        CountPairsNodes countPairsNodes = new CountPairsNodes();
        int[][] edges = {{1, 2}, {2, 4}, {1, 3}, {2, 3}, {2, 1}};
        int[] queries = {2, 3};
        System.out.println(Arrays.toString(countPairsNodes.countPairs(4, edges, queries)));
    }
}