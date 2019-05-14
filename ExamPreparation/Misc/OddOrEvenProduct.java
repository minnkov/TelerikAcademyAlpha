package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class OddOrEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] numbers = scanner.nextLine().split(" ");

        BigInteger oddProduct = BigInteger.ONE;
        BigInteger evenProduct = BigInteger.ONE;

        int elementCounter = 1;

        for (int i = 0; i < numbers.length; i++) {

            if (elementCounter % 2 == 0) {
                evenProduct = evenProduct.multiply(BigInteger.valueOf(Integer.parseInt(numbers[i])));
            } else {
                oddProduct = oddProduct.multiply(BigInteger.valueOf(Integer.parseInt(numbers[i])));
            }
            elementCounter++;
        }

        if (oddProduct.equals(evenProduct)) {
            System.out.println("yes " + evenProduct);
        } else {
            System.out.println("no " + oddProduct + " " + evenProduct);
        }
    }
}
