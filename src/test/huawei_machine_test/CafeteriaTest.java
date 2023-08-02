package test.huawei_machine_test;

import main.huawei_machine_test.Cafeteria;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class CafeteriaTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        Cafeteria.solution(N, M, s);

    }
}