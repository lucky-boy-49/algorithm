package test.huawei_machine_test;

import main.huawei_machine_test.SensitiveFieldEncryption;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class SensitiveFieldEncryptionTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        String res = SensitiveFieldEncryption.solution(k, s);
        System.out.println(res);
    }
}