package test.huawei_machine_test;

import main.huawei_machine_test.EnhancedStrstr;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class EnhancedStrstrTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);

        String src = scanner.nextLine();
        String tar = scanner.nextLine();
        System.out.println(EnhancedStrstr.solution(src, tar));
    }
}