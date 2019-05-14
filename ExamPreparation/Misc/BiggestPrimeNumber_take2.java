package e_Misc;

import java.util.Scanner;

public class BiggestPrimeNumber_take2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            int divisionCounter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisionCounter++;
                }
            }
            if (divisionCounter == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
