import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) return "" + "\n" + "";

        java.util.List<String> list = new java.util.ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(list);
        String smallest = list.get(0);
        String largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}