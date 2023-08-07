package test.huawei_machine_test;

import main.huawei_machine_test.DecompressMessage;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class DecompressMessageTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        DecompressMessage.solution(line);
    }
}