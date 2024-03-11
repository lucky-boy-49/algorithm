package huawei_machine_test;

import main.huawei_machine_test.ClusteringMinimumNumberExchanges;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ClusteringMinimumNumberExchangesTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        ClusteringMinimumNumberExchanges.solution(line, k);
    }
}