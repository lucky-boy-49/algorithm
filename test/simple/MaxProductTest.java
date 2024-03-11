package simple;

import main.simple.MaxProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductTest {

    @Test
    void maximumProduct() {
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.maximumProduct(new int[]{1, 2, 3, 4}));
    }
}