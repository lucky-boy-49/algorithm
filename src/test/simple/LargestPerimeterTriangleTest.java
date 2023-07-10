package test.simple;

import main.simple.LargestPerimeterTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPerimeterTriangleTest {

    @Test
    void largestPerimeter() {

        LargestPerimeterTriangle triangle = new LargestPerimeterTriangle();
        int[] nums = new int[] {1, 2, 1, 10};
        int i1 = triangle.largestPerimeter(nums);
        int i2 = triangle.largestPerimeter2(nums);
        System.out.println(i1);
        System.out.println(i2);
    }
}