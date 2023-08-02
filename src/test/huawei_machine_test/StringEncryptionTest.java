package test.huawei_machine_test;

import main.huawei_machine_test.StringEncryption;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StringEncryptionTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] line = new String[n];
        for (int i = 0; i < n; i++) {
            line[i] = scanner.nextLine();
        }
        StringEncryption.solution(n, line);
    }
}