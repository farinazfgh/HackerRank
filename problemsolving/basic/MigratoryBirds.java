package problemsolving.basic;

import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            Integer count = map.get(value);
            if (count == null) count = 1;
            else count++;
            map.put(value, count);
        }

        Map<Integer, Integer> sortedMapByValue =
                map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(
                                Collectors
                                        .toMap(
                                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMapByValue.entrySet().iterator().next().getKey();
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        System.out.println(migratoryBirds(list));
    }
}
