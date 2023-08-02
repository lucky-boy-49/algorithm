package main.huawei_machine_test;

import java.util.Arrays;

public class BackgammonFans {

    public static void solution(int num, String line) {
        int[] vec = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        if (vec.length <= 1 || vec.length >= 40 || vec.length % 2 != 1) {
            return;
        }

        // 找到当前子在未落子前的最大连续长度 cur_max
        int curMax = 0;
        int j = 0;
        for (int k : vec) {
            if (k == num) {
                j++;
            } else {
                j = 0;
            }
            curMax = Math.max(curMax, j);
        }

        // len[i] 表示落子到 i 这个位置，包含 i 这个位置的当前子的最大长度
        int[] lenArr = new int[vec.length];
        int maxLen = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == 0) {
                int l = i - 1, r = i + 1;
                while (l >= 0 && vec[l] == num) l--;
                while (r < vec.length && vec[r] == num) r++;
                if (r - l - 1 <= 5) {
                    lenArr[i] = r - l - 1;
                    maxLen = Math.max(maxLen, lenArr[i]);
                }
            }
        }

        if (maxLen <= curMax) {
            System.out.println("-1");
        } else {
            int ansidx = -1;
            int mid = (vec.length - 1) / 2;
            for (int i = 0; i < vec.length; i++) {
                if (lenArr[i] > curMax) {
                    if (ansidx == -1 || Math.abs(ansidx - mid) > Math.abs(i - mid)) {
                        ansidx = i;
                    }
                }
            }
            System.out.println(ansidx);
        }

    }

}
