package main.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3164Test {

    @Test
    void numberOfPairs2() {
        S3164 s3164 = new S3164();
        Assertions.assertEquals(5, s3164.numberOfPairs2(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1));
    }
}