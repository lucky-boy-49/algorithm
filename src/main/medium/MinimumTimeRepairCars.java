package main.medium;

/**
 * @author HJ
 * @date 2023/9/7 10:08
 * @description 2594. 修车的最少时间
 */
public class MinimumTimeRepairCars {

    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = (long) ranks[0] * cars * cars;
        while (l < r) {
            long m = l + r >> 1;
            if (check(ranks, cars, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean check(int[] ranks, int cars, long m) {
        long cnt = 0;
        for (int rank : ranks) {
            cnt += (long) Math.sqrt((double) m / rank);
        }
        return cnt >= cars;
    }

}
