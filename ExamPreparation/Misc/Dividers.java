package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        List<Integer> mPrimeDividers = new ArrayList<>();

        for (int i = 2; i <= m ; i++) {

            int divisionCounter = 0;

            boolean isPrime = true;

            if (m % i == 0) {
                for (int j = 1; j <= i ; j++) {

                    if (i % j == 0) {

                        divisionCounter++;
                    }

                    if (divisionCounter > 2) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                continue;
            }

            if (isPrime) {
                mPrimeDividers.add(i);
            }
        }

        List<Integer> nPrimeDividers = new ArrayList<>();

        for (int i = 2; i <= n ; i++) {

            int divisionCounter = 0;

            boolean isPrime = true;

            if (n % i == 0) {
                for (int j = 1; j <= i ; j++) {

                    if (i % j == 0) {

                        divisionCounter++;
                    }

                    if (divisionCounter > 2) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                continue;
            }

            if (isPrime) {
                nPrimeDividers.add(i);
            }
        }

        //find m and n common dividers

        String output = "";

        for (int mPrimeDivider : mPrimeDividers) {

            for (int nPrimeDivider : nPrimeDividers) {

                if (mPrimeDivider == nPrimeDivider) {
                    output += mPrimeDivider + " ";
                    break;
                }
            }
        }

        if (output.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(output.trim());
        }
    }
}
