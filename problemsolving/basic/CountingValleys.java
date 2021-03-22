package problemsolving.basic;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0;     // # of valleys
        int level = 0;   // current level
        for (char c : path.toCharArray()) {
            if (c == 'U') ++level;
            if (c == 'D') --level;

            // if we just came UP to sea level
            if (level == 0 && c == 'U')
                ++valleys;

        }
        return valleys;
    }

}
