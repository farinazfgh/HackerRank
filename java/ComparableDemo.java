import java.util.Arrays;
import java.util.Scanner;

// Write your Checker class here

class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        if (score > o.score) return -1;
        else if (score < o.score) return 1;
        else return name.compareTo(o.name);
    }
}

class ComparableDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}