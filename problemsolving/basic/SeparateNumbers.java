package problemsolving.basic;


public class SeparateNumbers {
    //sometimes creating the solution is more efficient than finding it
    static boolean splitToWindows(String s, int windowSize) {
        if (windowSize > s.length()) return false;
        Long first = Long.parseLong(s.substring(0, windowSize));
        StringBuilder sb = new StringBuilder(String.valueOf(first));
        while (sb.length() < s.length()) {
            first++;
            sb.append(first);
        }
        return sb.toString().equals(s);
    }



    static void separateNumbers(String s) {
        for (int i = 1; i <= (s.length() / 2); i++) {
            if (splitToWindows(s, i)) {
                System.out.println("YES " + s.substring(0, i));
                return;
            }
        }
        System.out.println("NO");
    }



    public static void main(String[] args) {
        separateNumbers("7891011");
    }
}
