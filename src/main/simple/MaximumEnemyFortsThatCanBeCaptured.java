package main.simple;

/**
 * @author HJ
 * @date 2023/9/2 08:51
 * @description 2511. 最多可以摧毁的敌人城堡数目
 */
public class MaximumEnemyFortsThatCanBeCaptured {

    public int captureForts(int[] forts) {
        int res = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                int j = i - 1;
                while (j >= 0 && forts[j] == 0) j--;
                if (j >= 0 && forts[j] == -1) {
                    res = Math.max(res, i - j - 1);
                }
                j = i + 1;
                while (j < forts.length && forts[j] == 0) j++;
                if (j < forts.length && forts[j] == -1) {
                    res = Math.max(res, j - i - 1);
                }
            }
        }
        return res;
    }

}
