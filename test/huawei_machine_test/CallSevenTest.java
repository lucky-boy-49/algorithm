package huawei_machine_test;

import main.huawei_machine_test.CallSeven;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CallSevenTest {

    @Test
    void solution() {
        int[] array = Arrays.stream("0 0 0 2 1".split(" ")).mapToInt(Integer::parseInt).toArray();
        CallSeven.solution(array);
    }
}