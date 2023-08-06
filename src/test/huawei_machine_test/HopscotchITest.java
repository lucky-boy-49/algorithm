package test.huawei_machine_test;

import main.huawei_machine_test.HopscotchI;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class HopscotchITest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        HopscotchI.solution(line, count);
    }
}