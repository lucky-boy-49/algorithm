package main.simple;

/**
 * 删除数组中的重复项
 */
public class RemoveDuplicatesArray {

    public int rda(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int i = 0, j = 1;
        while (j < array.length) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
            j++;
        }
        return ++i;
    }

}
