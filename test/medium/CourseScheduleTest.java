package medium;

import main.medium.CourseSchedule;
import org.junit.jupiter.api.Test;

/**
 * @author HJ
 * @date 2023/9/8 22:31
 * @description
 */
class CourseScheduleTest {

    @Test
    void canFinish() {
        int[][] prerequisites = new int[][] {
                {1, 0},
                {0, 1}
        };
        int numCourses = 2;
        CourseSchedule courseSchedule = new CourseSchedule();
        System.out.println(courseSchedule.canFinish(numCourses, prerequisites));
    }
}