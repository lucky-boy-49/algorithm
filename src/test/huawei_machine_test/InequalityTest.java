package test.huawei_machine_test;

import main.huawei_machine_test.Inequality;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class InequalityTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Inequality.solution(line);
    }
}