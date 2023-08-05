package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 比赛的冠亚季军
 */
public class Contest {

    public static void solution(String line) {

        int[] split = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> cur = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            cur.add(i);
        }

        while (cur.size() > 3) {
            pre = new ArrayList<Integer>(cur);
            for (int i = 0; i + 1 < cur.size(); i++) {
                if (split[cur.get(i)] >= split[cur.get(i + 1)]) {
                    cur.remove(i + 1);
                } else {
                    cur.remove(i);
                }
            }
        }
        cur.sort((i1, i2) -> {
            return split[i2] - split[i1];
        });
        if (cur.size() == 2) {
            pre.sort((i1, i2) -> {
                return split[i2] - split[i1];
            });
            for (Integer i : pre) {
                if (!cur.contains(i)) {
                    cur.add(i);
                    break;
                }
            }
        }
        if (cur.size() == 1) {
            pre.sort((i1, i2) -> {
                return split[i2] - split[i1];
            });
            int j = 0;
            for (Integer i : pre) {
                if (!cur.contains(i)) {
                    cur.add(i);
                    j++;
                    if (j == 2) {
                        break;
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        cur.forEach(i -> {
            res.append(i).append(" ");
        });
        System.out.println(res.toString().trim());
    }

}
