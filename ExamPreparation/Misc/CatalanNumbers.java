package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());

        for (int k = 0; k <= m ; k++) {
            int n = k;
            int nPlusOne = n + 1;
            int nTimesTwo = n * 2;

            BigInteger nFact = BigInteger.ONE;
            BigInteger nPlusOneFact = BigInteger.ONE;
            BigInteger nTimesTwoFact = BigInteger.ONE;

            for (int i = 1; i <= nTimesTwo ; i++) {
                nTimesTwoFact = nTimesTwoFact.multiply(BigInteger.valueOf(i));

                if (i <= nPlusOne) {
                    nPlusOneFact = nPlusOneFact.multiply(BigInteger.valueOf(i));
                }
                if (i <= n) {
                    nFact = nFact.multiply(BigInteger.valueOf(i));
                }
            }

            BigInteger divisor = nPlusOneFact.multiply(nFact);
            BigInteger result = nTimesTwoFact.divide(divisor);

            System.out.print("\"" + result + "\"" + ", ");
        }
    }
}
