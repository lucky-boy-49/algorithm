package test.huawei_machine_test;

import main.huawei_machine_test.AvailableCharacterRemaining;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class AvailableCharacterRemainingTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        AvailableCharacterRemaining.solution(line);
    }
}