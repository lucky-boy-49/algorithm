package huawei_machine_test;

import main.huawei_machine_test.DistributeFiles;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class DistributeFilesTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        DistributeFiles.solution(line);
    }
}