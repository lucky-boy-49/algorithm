package main.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Dota2 Senate
 */
public class Dota2Senate {

    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            Integer r = rQueue.poll();
            Integer d = dQueue.poll();
            if (r < d) {
                rQueue.offer(r + senate.length());
            }
            if (d < r) {
                dQueue.offer(d + senate.length());
            }
        }

        if (dQueue.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }

    }

}
