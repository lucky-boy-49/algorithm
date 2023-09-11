package main.difficulty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author HJ
 * @date 2023/9/11 09:49
 * @description 630. 课程表 III
 */
public class CourseScheduleIII {

    public int scheduleCourse(int[][] courses) {

        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int total = 0;
        for (int[] cours : courses) {
            int ti = cours[0], di = cours[1];
            if (total + ti <= di) {
                total += ti;
                queue.offer(ti);
            } else if (!queue.isEmpty() && queue.peek() > ti) {
                total -= queue.poll() - ti;
                queue.offer(ti);
            }
        }

        return queue.size();
    }

}
