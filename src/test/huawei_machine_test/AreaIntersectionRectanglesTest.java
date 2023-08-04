package test.huawei_machine_test;

import main.huawei_machine_test.AreaIntersectionRectangles;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 14:14
 * @description
 */
class AreaIntersectionRectanglesTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        AreaIntersectionRectangles.solution(strings);
    }
}