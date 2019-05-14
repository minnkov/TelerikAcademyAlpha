package e_Misc;

import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String number = scanner.nextLine();

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < number.length(); j++) {

                int digit = Character.getNumericValue(number.charAt(j));

                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            printDirection(oddSum, evenSum);
        }
    }

    private static void printDirection(int oddSum, int evenSum) {

        if (evenSum > oddSum) {
            System.out.println("left");
        } else if (oddSum > evenSum) {
            System.out.println("right");
        } else {
            System.out.println("straight");
        }
    }
}
