package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author HJ
 * @date 2023/5/23 17:28
 * @description 970. 强整数
 */
public class PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        // 1.声明排序集合
        Set<Integer> set = new HashSet<>();
        // 2.
        int value1 = 1, max = 21;
        for (int i = 0; i < max; i++) {
            int value2 = 1;
            for (int j = 0; j < max; j++) {
                int value = value1 + value2;
                if (value <= bound) {
                    set.add(value);
                } else {
                    break;
                }
                value2 *= y;
            }
            if (value1 > bound) {
                break;
            }
            value1 *= x;
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int x = 2, y = 3, bound = 10;
        PowerfulIntegers integers = new PowerfulIntegers();
        integers.powerfulIntegers(x, y, bound).forEach(System.out::println);
    }

}
