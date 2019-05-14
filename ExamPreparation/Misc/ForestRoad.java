package e_Misc;

import java.util.Scanner;

public class ForestRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] map = new String[n];

        for (int i = 0; i < map.length; i++) {
            map[i] = ".";
        }

        int indexer = 0;
        boolean reachedTheEnd = false;

        for (int i = 0; i < 2 * n - 1 ; i++) {

            if (indexer == map.length) {
                reachedTheEnd = true;
            }

            if (reachedTheEnd) {
                if (i == map.length) {
                    indexer -= 2;
                } else {
                    indexer--;
                }
            }

            map[indexer] = "*";
            System.out.println(String.join("", map));
            map[indexer] = ".";

            if (!reachedTheEnd) {
                indexer++;
            }
        }
    }
}
