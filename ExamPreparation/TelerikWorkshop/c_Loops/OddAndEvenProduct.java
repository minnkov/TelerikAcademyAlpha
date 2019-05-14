package c_Loops;

import java.util.Scanner;

public class OddAndEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddProduct = 1;
        int evenProduct = 1;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenProduct *= number;
            } else {
                oddProduct *= number;
            }
        }
        if (oddProduct == evenProduct) {
            System.out.println("yes " + oddProduct);
        } else {
            System.out.printf("no %d %d", oddProduct, evenProduct);
        }
    }
}
