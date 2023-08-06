package test.huawei_machine_test;

import main.huawei_machine_test.PythagoreanNumber;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class PythagoreanNumberTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        PythagoreanNumber.solution(start, end);
    }
}