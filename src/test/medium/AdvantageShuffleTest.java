package test.medium;

import main.medium.AdvantageShuffle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AdvantageShuffleTest {

    @Test
    void advantageCount() {
        AdvantageShuffle advantageShuffle = new AdvantageShuffle();
        int[] nums1 = {12,24,8,32};
        int[] nums2 = {13,25,32,11};
        Arrays.stream(advantageShuffle.advantageCount(nums1, nums2)).forEach(System.out::println);
    }
}