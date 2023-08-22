package main.medium;

import java.util.Arrays;

/**
 * 274. H 指数
 */
public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int[] z = new int[citations.length + 1];
        int i = 0;
        for (int j = 1; j < z.length; j++) {
            for (; i < citations.length; i++) {
                if (citations[i] >= j) break;
            }
            z[j] = citations.length - i;
        }
        int res = 0;
        for (int i1 = 1; i1 < z.length; i1++) {
            if (z[i1] >= i1) {
                res = Math.max(res, i1);
            }
        }
        return res;
    }

}
