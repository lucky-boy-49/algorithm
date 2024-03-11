package medium;

import main.medium.CourseScheduleIV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/12 09:28
 * @description
 */
class CourseScheduleIVTest {

    @Test
    void checkIfPrerequisite() {

        CourseScheduleIV courseScheduleIV = new CourseScheduleIV();
        int numCourses = 4;
        int[][] prerequisites = new int[][] {{2, 3}, {2, 1}, {0, 3}, {0, 1}};
        int[][] queries = new int[][] {{0, 1}, {0, 3}, {2, 3}, {3, 0}, {2, 0}, {0, 2}};
        System.out.println(courseScheduleIV.checkIfPrerequisite(numCourses, prerequisites, queries));

    }
}