package test.huawei_machine_test;

import main.huawei_machine_test.VLANResourcePool;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class VLANResourcePoolTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String vlanPool = scanner.nextLine();
        int v = scanner.nextInt();
        VLANResourcePool.solution(vlanPool, v);
    }
}