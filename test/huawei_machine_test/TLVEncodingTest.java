package huawei_machine_test;

import main.huawei_machine_test.TLVEncoding;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class TLVEncodingTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine();
        String source = scanner.nextLine();
        TLVEncoding.solution(tag, source);
    }
}