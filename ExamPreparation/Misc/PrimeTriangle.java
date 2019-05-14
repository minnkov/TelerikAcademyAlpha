package e_Misc;

import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int divisionCounter = 0;

            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    divisionCounter++;
                }
            }
            if (divisionCounter <= 2) {

                for (int j = 1; j <= i; j++) {
                    divisionCounter = 0;

                    for (int k = 1; k <= j ; k++) {
                       if (j % k == 0) {
                           divisionCounter++;
                       }
                    }
                    if (divisionCounter > 2) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }
                System.out.println();
            }
        }
    }
}
