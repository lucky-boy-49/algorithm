package test.huawei_machine_test;

import main.huawei_machine_test.RelativelyOpenSyllable;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 11:28
 * @description
 */
class RelativelyOpenSyllableTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        RelativelyOpenSyllable.solution(line);

    }
}