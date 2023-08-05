package test.medium;

import org.junit.jupiter.api.Test;
import test.huawei_machine_test.CalculateMaximumProduct;

import java.util.Scanner;

class CalculateMaximumProductTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        CalculateMaximumProduct.solution(line);
    }
}