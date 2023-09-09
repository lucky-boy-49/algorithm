package test.medium;

import main.medium.CourseScheduleII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/9/9 10:14
 * @description
 */
class CourseScheduleIITest {

    @Test
    void findOrder() {
        int[][] prerequisites = new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int numCourses = 4;
        CourseScheduleII csii = new CourseScheduleII();
        System.out.println(Arrays.toString(csii.findOrder(numCourses, prerequisites)));
    }
}