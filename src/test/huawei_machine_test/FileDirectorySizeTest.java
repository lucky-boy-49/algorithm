package test.huawei_machine_test;

import main.huawei_machine_test.FileDirectorySize;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class FileDirectorySizeTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        String[] ds = new String[m];
        for (int i = 0; i < m; i++) {
            ds[i] = scanner.nextLine();
        }
        FileDirectorySize.solution(n, ds);
    }
}