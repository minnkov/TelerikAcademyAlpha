package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        BigInteger nFact = BigInteger.ONE;
        BigInteger kFact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            nFact = nFact.multiply(BigInteger.valueOf(i));

            if (i <= k) {
                kFact = kFact.multiply(BigInteger.valueOf(i));
            }
        }

        BigInteger result = nFact.divide(kFact);

        System.out.println(result);
    }
}
