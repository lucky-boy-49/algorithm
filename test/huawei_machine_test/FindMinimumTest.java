package huawei_machine_test;

import main.huawei_machine_test.FindMinimum;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class FindMinimumTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        FindMinimum.solution(num1, num2);
    }
}