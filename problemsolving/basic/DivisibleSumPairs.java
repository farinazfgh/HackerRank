package problemsolving.basic;

public class DivisibleSumPairs {
    //TODO find the linear solution
    static int divisibleSumPairsQuadratic(int k, int[] ar) {
        int num = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = {34, 38, 30, 27, 1, 81, 37, 19, 74, 73, 32, 13, 44, 99, 7, 88, 50, 52, 32, 82, 29, 1, 55, 85, 89, 58, 35, 19, 76, 55, 45, 37, 41, 74, 80, 46, 38, 74, 56, 18, 86, 23, 57, 27, 52, 9, 69, 78, 52, 8, 62, 85, 65, 2, 11, 70, 34, 26, 72, 11, 20, 32, 9, 75, 74, 85, 29, 6, 87, 81, 40, 11, 31, 49, 66, 91, 99, 85, 18, 54, 81, 93, 52, 9, 72, 89, 85, 66, 24, 11, 85, 3, 14, 36, 72, 3, 76, 99, 88, 8};
        System.out.println(divisibleSumPairsQuadratic(96, a));

    }
}
