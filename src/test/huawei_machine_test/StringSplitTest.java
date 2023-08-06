package test.huawei_machine_test;

import main.huawei_machine_test.StringSplit;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StringSplitTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringSplit.solution(s);
    }
}