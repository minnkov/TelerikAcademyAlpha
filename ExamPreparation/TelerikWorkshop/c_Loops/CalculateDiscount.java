package c_Loops;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            double itemPrice = Double.parseDouble(scanner.nextLine());
            double discountedPrice = itemPrice * 0.35;
            System.out.printf("%.2f%n", discountedPrice);
        }
    }
}
