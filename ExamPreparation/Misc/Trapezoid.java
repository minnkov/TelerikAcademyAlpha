package e_Misc;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] line = new String[2 * n];

        int indexer = n - 1;

        for (int i = 1; i <= n + 1 ; i++) {

            if (i == 1) {
                for (int j = 0; j < line.length; j++) {
                    if (j < n) {
                        line[j] = ".";
                    } else {
                        line[j] = "*";
                    }
                }
                System.out.println(String.join("", line));

                for (int j = n; j < line.length - 1; j++) {
                    line[j] = ".";
                }
            } else if (i == (n + 1)) {
                for (int j = 0; j < line.length - 1; j++) {
                    line[j] = "*";
                }
                System.out.println(String.join("", line));
            } else {
                line[indexer] = "*";
                System.out.println(String.join("", line));
                line[indexer] = ".";
                indexer--;
            }
        }
    }
}
