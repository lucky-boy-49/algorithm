package medium;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author HJ
 * @date 2023/5/23 18:33
 * @description 1090. 受标签影响的最大值
 */
public class LargestValuesFromLabels {

    public int largestValuesFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        Stream<Integer> boxed = IntStream.range(0, values.length).boxed();
        Map<Integer, List<Integer>> collect = boxed.collect(Collectors.groupingBy(i -> labels[i],
                Collectors.mapping(i -> values[i],
                        Collectors.toList())));
        Collection<List<Integer>> values1 = collect.values();
        Stream<Integer> integerStream = values1.stream().flatMap(list -> list.stream().sorted(Comparator.reverseOrder()).limit(useLimit));
        Stream<Integer> sorted = integerStream.sorted(Comparator.reverseOrder());
        Stream<Integer> limit = sorted.limit(numWanted);
        IntStream intStream = limit.mapToInt(Integer::intValue);
        int sum = intStream.sum();
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
