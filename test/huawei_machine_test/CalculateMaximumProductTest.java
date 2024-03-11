package huawei_machine_test;

import main.huawei_machine_test.CalculateMaximumProduct;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class CalculateMaximumProductTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        CalculateMaximumProduct.solution(line);
    }
}