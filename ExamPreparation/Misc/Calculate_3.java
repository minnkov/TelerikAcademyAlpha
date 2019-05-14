package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculate_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int nMinusK = n - k;

        BigInteger nFact = BigInteger.ONE;
        BigInteger kFact = BigInteger.ONE;
        BigInteger nMinusKFact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            nFact = nFact.multiply(BigInteger.valueOf(i));

            if (i <= k) {
                kFact = kFact.multiply(BigInteger.valueOf(i));
            }
            if (i <= nMinusK) {
                nMinusKFact = nMinusKFact.multiply(BigInteger.valueOf(i));
            }
        }

        BigInteger divisor = kFact.multiply(nMinusKFact);
        BigInteger result = nFact.divide(divisor);

        System.out.println(result);
    }
}
