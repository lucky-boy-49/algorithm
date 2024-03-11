package huawei_machine_test;

import main.huawei_machine_test.Classification;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ClassificationTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Classification.solution(line);
    }
}