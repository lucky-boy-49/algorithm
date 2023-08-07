package test.huawei_machine_test;

import main.huawei_machine_test.JumpGrid2;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class JumpGrid2Test {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        JumpGrid2.solution(line);
    }
}