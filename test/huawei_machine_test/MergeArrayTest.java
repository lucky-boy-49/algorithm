package huawei_machine_test;

import main.huawei_machine_test.MergeArray;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class MergeArrayTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String[] line = new String[n];
        for (int i = 0; i < n; i++) {
            line[i] = scanner.nextLine();
        }
        MergeArray.solution(len, line);
    }
}