package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class AboveTheMainDiagonal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger sum = BigInteger.ZERO;
        int lineCounter = 0;
        int initMathPow = 0;

        for (int i = 0; i < n; i++) {

            int mathPow = initMathPow;

            for (int j = 0; j < n - lineCounter; j++) {

                BigInteger numberToAdd = BigInteger.valueOf(2).pow(mathPow);

                sum = sum.add(numberToAdd);

                mathPow ++;
            }

            lineCounter ++;
            initMathPow += 2;
        }

        System.out.println(sum);
    }
}
