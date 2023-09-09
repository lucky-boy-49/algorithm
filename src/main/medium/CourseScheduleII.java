package main.medium;

import java.util.*;

/**
 * @author HJ
 * @date 2023/9/9 09:49
 * @description
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res = new LinkedList<>();
        int[] node = new int[numCourses];
        List<List<Integer>> lists = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            lists.add(new LinkedList<>());
        }
        for (int[] prerequisite : prerequisites) {
            node[prerequisite[0]]++;
            lists.get(prerequisite[1]).add(prerequisite[0]);
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < node.length; i++) {
            if (node[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            res.add(poll);
            List<Integer> list = lists.get(poll);
            for (Integer i1 : list) {
                node[i1]--;
                if (node[i1] == 0) {
                    queue.add(i1);
                }
            }
        }
        if (res.size() == numCourses) {
            int[] r = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                r[i] = res.get(i);
            }
            return r;
        } else {
            return new int[] {};
        }
    }

}
