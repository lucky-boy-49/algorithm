package test.simple;

import main.simple.RemoveDuplicatesArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesArrayTest {

    @Test
    void rda() {
        int[] array = {0, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesArray removeDuplicatesArray = new RemoveDuplicatesArray();
        System.out.println(removeDuplicatesArray.rda(array));
    }
}