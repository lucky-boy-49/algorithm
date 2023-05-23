package medium;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author HJ
 * @date 2023/5/23 18:33
 * @description 1090. 受标签影响的最大值
 */
public class LargestValuesFromLabels {

    public int largestValuesFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        return IntStream.range(0, values.length).boxed()
                .collect(Collectors.groupingBy(i -> labels[i],
                        Collectors.mapping(i -> values[i],
                                Collectors.toList())))
                .values()
                .stream()
                .flatMap(list -> list.stream().sorted(Comparator.reverseOrder()).limit(useLimit))
                .sorted(Comparator.reverseOrder())
                .limit(numWanted)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        int[] values = {5, 4, 3, 2, 1}, labels = {1, 1, 2, 2, 3};
        int numWanted = 3, useLimit = 1;
        LargestValuesFromLabels values1 = new LargestValuesFromLabels();
        System.out.println(values1.largestValuesFromLabels(values, labels, numWanted, useLimit));
    }

}
