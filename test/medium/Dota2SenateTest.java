package medium;

import main.medium.Dota2Senate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dota2SenateTest {

    @Test
    void predictPartyVictory() {

        Dota2Senate dota2Senate = new Dota2Senate();
        System.out.println(dota2Senate.predictPartyVictory("RDD"));

    }
}