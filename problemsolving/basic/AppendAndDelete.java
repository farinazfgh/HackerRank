package problemsolving.basic;

public class AppendAndDelete {
    static String appendToEnd(String s, char ch) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(ch);
        return sb.toString();
    }

    static String deleteLastChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(s.length() - 1);
        return sb.toString();
    }

    // Complete the appendAndDelete function below.

    static String appendAndDelete(String s, String t, int k) {
        int count = 0;
        for (int i = t.length() - 1; count < k; ) {
            if (s.charAt(j) != t.charAt(i)) {
                t = deleteLastChar(t);
                count++;
                j--;
                i--;
            } else break;
        }
        for (int i = t.length(); i < s.length() && count < k; i++) {
            appendToEnd(t, s.charAt(i));
            count++;
        }
        if (t.equals(s)) return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        appendAndDelete("hackerrank", "hackerhappy", 9);
    }
}
