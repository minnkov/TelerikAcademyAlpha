package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        BigInteger paidAmount = new BigInteger(input[0]);
        BigInteger cost = new BigInteger(input[1]);

        BigInteger change = paidAmount.subtract(cost);

        System.out.println(change);
    }
}
