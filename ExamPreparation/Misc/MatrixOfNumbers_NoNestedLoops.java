package e_Misc;

import java.util.Scanner;

public class MatrixOfNumbers_NoNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            printNumbersLine(n, i);
        }
    }

    public static void printNumbersLine(int n, int i) {
        for (int j = i; j < n + i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
