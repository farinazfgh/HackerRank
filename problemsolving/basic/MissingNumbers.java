package problemsolving.basic;

import java.util.*;

public class MissingNumbers {
    private static int[] missingNumbers(int[] arr, int[] brr) {
        int RADIX[] = new int[10001];
        for (int j : brr) RADIX[j]++;
        for (int j : arr) RADIX[j]--;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10001; i++)
            if (RADIX[i] > 0)
                result.add(i);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    static Map<Integer, Integer> countValues(Integer[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            Integer count = map.get(val);
            if (count == null) {
                count = 1;
            } else count++;
            map.put(val, count);
        }
        return map;
    }


    static Integer[] missingNumbers(Integer[] arr, Integer[] brr) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        List<Integer> diff;
        if (arr.length > brr.length) diff = compareMaps(arr, brr);
        else diff = compareMaps(brr, arr);

        Integer[] result = new Integer[diff.size()];
        for (int i = 0; i < diff.size(); i++) {
            result[i] = diff.get(i);
        }
        return result;
    }

    private static List<Integer> compareMaps(Integer[] arr, Integer[] brr) {
        Map<Integer, Integer> arrMap = countValues(arr);
        Map<Integer, Integer> brrMap = countValues(brr);
        List<Integer> diff = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            Integer key = entry.getKey();
            if (!entry.getValue().equals(brrMap.get(key))) {
                diff.add(key);
            }
        }
        return diff;
    }

    static Integer[] missingNumbersTimeExceeded(Integer[] arr, Integer[] brr) {
        Arrays.sort(arr);
        List<Integer> list2 = new LinkedList<>(Arrays.asList(brr));
        Collections.sort(list2);
        for (Integer integer : arr) {
            if (Collections.binarySearch(list2, integer) != -1) list2.remove(integer);
        }
        Integer[] result = new Integer[list2.size()];
        int index = 0;
        for (Integer val : list2) {
            result[index++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        Integer[] arr2 = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
        Integer[] result = missingNumbers(arr1, arr2);
        System.out.println(result.length);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
