package test.huawei_machine_test;

import main.huawei_machine_test.ClassicScreenSaver;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ClassicScreenSaverTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int t = scanner.nextInt();
        ClassicScreenSaver.solution(x, y, t);
    }
}