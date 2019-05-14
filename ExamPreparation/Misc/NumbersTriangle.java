package e_Misc;

import java.util.Scanner;

public class NumbersTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 2 * n; i++) {

            if (i <= n) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= 2 * n - i ; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
