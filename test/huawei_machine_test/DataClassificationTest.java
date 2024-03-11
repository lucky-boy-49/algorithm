package huawei_machine_test;

import main.huawei_machine_test.DataClassification;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class DataClassificationTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int b = scanner.nextInt();
        int[] dataArgs = new int[10];
        for (int i = 0; i < dataArgs.length; i++) {
            dataArgs[i] = scanner.nextInt();
        }
        DataClassification.solution(c, b, dataArgs);
    }
}