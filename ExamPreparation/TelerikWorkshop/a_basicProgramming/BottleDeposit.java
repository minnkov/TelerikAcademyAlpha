package a_basicProgramming;

import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int halfLiterBottles = Integer.parseInt(scanner.nextLine());
        int literBottles = Integer.parseInt(scanner.nextLine());

        double depositForHalfLiterBottles = halfLiterBottles * 0.1;
        double depositForLiterBottles = literBottles * 0.25;

        System.out.printf("%.2f", (depositForHalfLiterBottles + depositForLiterBottles));
    }
}
