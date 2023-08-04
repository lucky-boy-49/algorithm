package main.huawei_machine_test;

import java.util.*;

/**
 * @author HJ
 * @date 2023/8/4 12:20
 * @description
 * 矩形相交的面积
 */
public class AreaIntersectionRectangles {

    public static void solution(String[] line) {

        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("u", new ArrayList<>());
        map.put("d", new ArrayList<>());
        map.put("l", new ArrayList<>());
        map.put("r", new ArrayList<>());
        for (String string : line) {
            int[] s = Arrays.stream(string.split(" ")).mapToInt(Integer::parseInt).toArray();
            map.get("u").add(s[1]);
            map.get("d").add(s[1] - s[3]);
            map.get("l").add(s[0]);
            map.get("r").add(s[0] + s[2]);
        }

        int u = Collections.min(map.get("u"));
        int d = Collections.max(map.get("d"));
        int l = Collections.max(map.get("l"));
        int r = Collections.min(map.get("r"));

        int c = r - l;
        int k = u - d;

        System.out.println(c * k);

    }

}
