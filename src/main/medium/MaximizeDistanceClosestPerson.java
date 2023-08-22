package main.medium;

/**
 * 849. 到最近的人的最大距离
 */
public class MaximizeDistanceClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int left = 0, right, res = 0;
        while (left < seats.length && seats[left] == 0) left++;
        res = Math.max(res, seats[left]);
        while (left < seats.length) {
            right = left + 1;
            while (right < seats.length && seats[right] == 0) right++;
            if (right == seats.length) {
                res = Math.max(res, right - left - 1);
            } else {
                res = Math.max(res, (right - left) / 2);
            }
            left = right;
        }
        return res;
    }

    public int maxDistToClosest2(int[] seats) {
        int max = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int left = i - 1, right = i + 1;
                while (left >= 0 && seats[left] == 0) left--;
                while (right < seats.length && seats[right] == 0) right++;
                int curMin;
                if (left == -1) {
                    curMin = right - i;
                } else if (right == seats.length) {
                    curMin = i - left;
                } else {
                    curMin = Math.min(i - left, right - i);
                }
                if (max < curMin) {
                    max = curMin;
                }
            }
        }
        return max;
    }

}
