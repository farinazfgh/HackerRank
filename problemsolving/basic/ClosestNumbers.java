package problemsolving.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    static class Pair implements Comparable<Pair> {
        final int a;
        final int b;
        int diff;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
            this.diff = Math.abs(b - a);
        }

        public int compareTo(Pair pair) {
            return Integer.compare(diff, pair.diff);
        }
    }

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<Pair> list = new ArrayList<>();
        //2 3 3 4 4 5

        for (int i = 0; i < arr.length - 1; i++) {
            list.add(new Pair(arr[i], arr[i + 1]));

        }
        Collections.sort(list);
        Pair pair = list.get(0);
        int minimumDiff = pair.diff;
        int diff;
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            Pair newpair = list.get(i);
            diff = newpair.diff;
            if (diff != minimumDiff) {
                break;
            }
            count++;
        }

        int[] result = new int[count * 2];
        for (int i = 0, index = 0; i < count; i++) {
            Pair p = list.get(i);
            result[index++] = p.a;
            result[index++] = p.b;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {5, 4, 3, 2};
        int[] a2 = {-520, -470, -20, 30};
        int[] a3 = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};
        printArray(closestNumbers(a1));
        printArray(closestNumbers(a2));
        printArray(closestNumbers(a3));
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
