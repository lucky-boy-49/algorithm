package main.huawei_machine_test;

/**
 * 题目0256-补种未成活胡杨
 */
public class ReplantingUnsurvivedPopulusEuphratica {

    public static void solution(int N, int M, int[] ms, int K) {

        int max = 0, currNub = 0, currRepair = 0, i = 0, j = -1, left = 0;

        while (j < M - K) {
            if (i <= M - 1 && currRepair < K) {
                currRepair++;
                i++;
            } else if (i <= M - 1 && currRepair == K) {
                currNub = ms[i] - 1 - left;
                max = Math.max(currNub, max);
                j++;
                left = ms[j];
                currRepair = 0;
                i = j + 1;
            } else {
                max = N - left;
                j++;
            }
        }

        System.out.println(max);

    }

}
