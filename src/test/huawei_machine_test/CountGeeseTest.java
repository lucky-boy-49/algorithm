package test.huawei_machine_test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class CountGeeseTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        CountGeese.solution(line);
    }
}