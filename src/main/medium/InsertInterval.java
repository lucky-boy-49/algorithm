package main.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠
 * （如果有必要的话，可以合并区间）。
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 */
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0) {
            res.add(newInterval);
        } else {
            int i = 0;
            boolean flag = false;
            while (i < intervals.length) {
                int[] iAr = intervals[i];
                if ((iAr[0] <= newInterval[0] && iAr[1] >= newInterval[0]) ||
                        (newInterval[0] <= iAr[0] && newInterval[1] >= iAr[0])) {
                    iAr[0] = Math.min(iAr[0], newInterval[0]);
                    iAr[1] = Math.max(iAr[1], newInterval[1]);
                    newInterval = iAr;
                } else if (newInterval[1] < iAr[0] && !flag) {
                    res.add(newInterval);
                    res.add(iAr);
                    flag = true;
                } else {
                    res.add(iAr);
                }
                i++;
            }
            if (!flag) {
                res.add(newInterval);
            }
        }
        return res.toArray(int[][]::new);
    }

}
