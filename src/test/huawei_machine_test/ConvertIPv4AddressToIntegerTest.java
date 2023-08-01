package test.huawei_machine_test;

import main.huawei_machine_test.ConvertIPv4AddressToInteger;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ConvertIPv4AddressToIntegerTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ConvertIPv4AddressToInteger.solution(s);
    }
}