package main.medium;

import java.util.*;

/**
 * 1654. 到家的最少跳跃次数
 */
public class MinimumJumpsReachHome {

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        return jump(forbidden, a, b, x, a, 1, false);
    }

    private int jump(int[] forbidden, int a, int b, int x, int curNum, int count, boolean flag) {
        if (curNum < 0 || (a >= b && curNum > x)) {
            return -1;
        }
        if (curNum == x) {
            return count;
        }
        for (int i : forbidden) {
            if (i == curNum) {
                return -1;
            }
        }
        int jump1 = jump(forbidden, a, b, x, curNum + a, ++count, false);
        int jump2 = -1;
        if (!flag) {
            jump2 = jump(forbidden, a, b, x, curNum - b, ++count, true);
        }
        if (jump1 == -1 && jump2 != -1) {
            return jump2;
        } else if (jump1 != -1 && jump2 == -1) {
            return jump1;
        } else {
            return Math.min(jump1, jump2);
        }
    }

    public int minimumJumps2(int[] forbidden, int a, int b, int x) {
        Queue<int[]> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new int[]{0, 1, 0});
        visited.add(0);
        int lower = 0;
        int upper = 0;
        if (forbidden.length != 0) {
            upper = Math.max(Arrays.stream(forbidden).max().getAsInt() + a, x) + b;
        }
        Set<Integer> forbiddenSet = new HashSet<>();
        for (int position : forbidden) {
            forbiddenSet.add(position);
        }
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int position = arr[0], direction = arr[1], step = arr[2];
            if (position == x) {
                return step;
            }
            int nextPosition = position + a;
            int nextDirection = 1;
            if (lower <= nextPosition && nextPosition <= upper && !visited.contains(nextPosition * nextDirection) && !forbiddenSet.contains(nextPosition)) {
                visited.add(nextPosition * nextDirection);
                queue.offer(new int[]{nextPosition, nextDirection, step + 1});
            }
            if (direction == 1) {
                nextPosition = position - b;
                nextDirection = -1;
                if (lower <= nextPosition && nextPosition <= upper && !visited.contains(nextPosition * nextDirection) && !forbiddenSet.contains(nextPosition)) {
                    visited.add(nextPosition * nextDirection);
                    queue.offer(new int[]{nextPosition, nextDirection, step + 1});
                }
            }
        }
        return -1;
    }

}
