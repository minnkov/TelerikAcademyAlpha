package e_Misc;

import java.util.Scanner;

public class Dividers_faster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int forLoopLength = Math.min(m, n);

        int commonDividorsCount = getCommonPrimeDividers(m, n, forLoopLength);

        if (commonDividorsCount == 0) {
            System.out.println(-1);
        }
    }

    public static int getCommonPrimeDividers(int m, int n, int forLoopLength) {

        int commonDividorsCount = 0;

        for (int i = 2; i <= forLoopLength; i++) {

            int divisionCounter = 0;

            boolean isPrime = true;

            //check if "i" is a divisor of both numbers
            if (m % i == 0 && n % i == 0) {

                //check if "i" is prime
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {

                        divisionCounter++;

                        if (divisionCounter > 2) {
                            isPrime = false;
                            break;
                        }
                    }

                }
            } else {
                continue;
            }

            if (isPrime) {
                System.out.print(i + " ");
                commonDividorsCount++;
            }
        }
        return commonDividorsCount;
    }

}
