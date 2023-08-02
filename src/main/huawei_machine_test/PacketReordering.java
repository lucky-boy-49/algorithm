package main.huawei_machine_test;

import java.util.TreeMap;

public class PacketReordering {

    public static void solution(int N, String line) {
        if (N <= 0 || N > 1000) {
            return;
        }
        String[] split = line.split(" ");
        if (split.length != N) {
            return;
        }
        TreeMap<String, String> map = new TreeMap<>();
        for (String s : split) {
            String s1 = s.substring(0, s.length() - 1);
            String s2 = s.substring(s.length() - 1);
            if (!map.containsKey(s2)) {
                map.put(s2, s1);
            }
        }
        StringBuilder builder = new StringBuilder();
        map.forEach((key, value) -> builder.append(value).append(" "));
        System.out.println(builder.toString().trim());
    }

}
