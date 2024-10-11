package main.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 贺佳
 */
public class S3164 {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        Map<String, Integer> dp = new HashMap<>();
        for (int j : nums1) {
            if (j % k != 0) {
                continue;
            }
            for (int value : nums2) {
                String key = j + "_" + value;
                if (!dp.containsKey(key)) {
                    if (j % (value * k) == 0) {
                        dp.put(key, 1);
                        res++;
                    } else {
                        dp.put(key, 2);
                    }
                } else if (dp.get(key) == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public long numberOfPairs2(int[] nums1, int[] nums2, int k) {
        int mx1 = 0;
        for (int x : nums1) {
            if (x % k == 0) {
                mx1 = Math.max(mx1, x / k);
            }
        }
        if (mx1 == 0) {
            return 0;
        }

        int[] cnt1 = new int[mx1 + 1];
        for (int x : nums1) {
            if (x % k == 0) {
                cnt1[x / k]++;
            }
        }

        int mx2 = 0;
        for (int x : nums2) {
            mx2 = Math.max(mx2, x);
        }
        int[] cnt2 = new int[mx2 + 1];
        for (int x : nums2) {
            cnt2[x]++;
        }

        long ans = 0;
        for (int x = 1; x <= mx2; x++) {
            if (cnt2[x] == 0) {
                continue;
            }
            int s = 0;
            // 枚举 x 的倍数
            for (int y = x; y <= mx1; y += x) {
                s += cnt1[y];
            }
            ans += (long) s * cnt2[x];
        }
        return ans;
    }
}
