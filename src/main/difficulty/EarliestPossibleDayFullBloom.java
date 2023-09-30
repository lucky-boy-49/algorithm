package main.difficulty;

import java.util.stream.IntStream;

/**
 * @author HJ
 * @date 2023/9/30 21:03
 * @description 2136. 全部开花的最早一天
 */
public class EarliestPossibleDayFullBloom {

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int len = growTime.length;
        int prev = 0, ans = 0;
        for (Integer i : IntStream.range(0, len)
                .boxed()
                .sorted((o1, o2) -> growTime[o2] - growTime[o1])
                .toList()) {
            ans = Math.max(ans, prev + plantTime[i] + growTime[i]);
            prev += plantTime[i];
        }
        return ans;
    }

}
