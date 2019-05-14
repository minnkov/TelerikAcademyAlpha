package e_Misc;

import java.util.Scanner;

public class NumbersFrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
    }
}
