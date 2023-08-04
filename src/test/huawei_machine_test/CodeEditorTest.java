package test.huawei_machine_test;

import main.huawei_machine_test.CodeEditor;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class CodeEditorTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }
        CodeEditor.solution(lines, text);
    }
}