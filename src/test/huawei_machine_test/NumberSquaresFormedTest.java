package test.huawei_machine_test;

import main.huawei_machine_test.NumberSquaresFormed;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class NumberSquaresFormedTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] line = new String[n];
        for (int i = 0; i < line.length; i++) {
            line[i] = scanner.nextLine();
        }
        NumberSquaresFormed.solution(n, line);
    }
}