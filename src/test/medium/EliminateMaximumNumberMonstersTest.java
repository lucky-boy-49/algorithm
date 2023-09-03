package test.medium;

import main.medium.EliminateMaximumNumberMonsters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/3 08:59
 * @description
 */
class EliminateMaximumNumberMonstersTest {

    @Test
    void eliminateMaximum() {
        EliminateMaximumNumberMonsters monsters = new EliminateMaximumNumberMonsters();
        System.out.println(monsters.eliminateMaximum(new int[]{1, 3, 4}, new int[]{1, 1, 1}));
    }
}