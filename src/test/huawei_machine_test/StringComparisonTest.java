package test.huawei_machine_test;

import main.huawei_machine_test.StringComparison;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StringComparisonTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int v = scanner.nextInt();
        StringComparison.solution(a, b, v);
        StringComparison.solution2(a, b, v);
    }
}