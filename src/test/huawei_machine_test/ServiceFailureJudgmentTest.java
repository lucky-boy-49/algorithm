package test.huawei_machine_test;

import main.huawei_machine_test.ServiceFailureJudgment;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ServiceFailureJudgmentTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        ServiceFailureJudgment.solution(line1, line2);
    }
}