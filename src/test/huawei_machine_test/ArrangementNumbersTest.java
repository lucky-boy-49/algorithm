package test.huawei_machine_test;

import main.huawei_machine_test.ArrangementNumbers;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ArrangementNumbersTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrangementNumbers.solution(n);
    }
}