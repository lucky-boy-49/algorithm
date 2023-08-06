package main.huawei_machine_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 文件目录大小
 */
public class FileDirectorySize {

    private static class Directory {
        int value;

        int[] children;

        public Directory(int value, int[] children) {
            this.value = value;
            this.children = children;
        }
    }

    public static void solution(int n, String[] ds) {
        HashMap<Integer, Directory> map = new HashMap<>();
        for (String d : ds) {
            String[] split = d.split(" ");
            int id = Integer.parseInt(split[0]);
            int value = Integer.parseInt(split[1]);
            String s = split[2].replaceAll("[()]", "");
            int[] children = null;
            if (!s.isEmpty()) {
                String[] split1 = s.split(",");
                children = Arrays.stream(split1).mapToInt(Integer::parseInt).toArray();
            }
            Directory directory = new Directory(value, children);
            map.put(id, directory);
        }
        int res = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            Integer pop = queue.pop();
            Directory directory = map.get(pop);
            res += directory.value;
            if (directory.children != null) {
                for (int child : directory.children) {
                    queue.add(child);
                }
            }
        }
        System.out.println(res);
    }
}
