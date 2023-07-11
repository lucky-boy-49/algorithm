package main.simple;

/**
 * 70. Climbing Stairs
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int pre = 2, next = 1;
        for (int i = 2; i < n; i++) {
            int tmp = pre + next;
            pre = next;
            next = tmp;
        }
        return next;
    }

}
