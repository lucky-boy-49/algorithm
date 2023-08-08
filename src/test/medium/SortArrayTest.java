package test.medium;

import main.medium.SortArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortArrayTest {

    @Test
    void solution1() {
        int[] arr = {-2, 3, -5};
//        Arrays.stream(new SortArray().solution1(arr)).forEach(System.out::print);
//        System.out.println();
//        Arrays.stream(new SortArray().solution2(arr)).forEach(System.out::print);
//        System.out.println();
//        Arrays.stream(new SortArray().solution3(arr)).forEach(System.out::print);
//        System.out.println();
        Arrays.stream(new SortArray().solution4(arr)).forEach(System.out::print);
    }
}