package e_Misc;

import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int biggestPrime = 0;

        for (int i = 1; i <= n; i++) {
            int divisionCounter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisionCounter++;
                }
            }
            if (divisionCounter == 2) {
                biggestPrime = i;
            }
        }
        System.out.println(biggestPrime);
    }
}
