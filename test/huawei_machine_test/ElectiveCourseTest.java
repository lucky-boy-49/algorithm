package huawei_machine_test;

import main.huawei_machine_test.ElectiveCourse;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ElectiveCourseTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        String[] course1 = scanner.nextLine().split(";");
        String[] course2 = scanner.nextLine().split(";");
        ElectiveCourse.solution(course1, course2);

    }
}