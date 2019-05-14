package c_Loops;

import java.util.Scanner;

public class MinMaxSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double minNumber = Integer.MAX_VALUE;
        double maxNumber = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            sum += number;
        }
        double average = sum / n;
        System.out.printf("min=%.2f%nmax=%.2f%nsum=%.2f%navg=%.2f%n", minNumber, maxNumber, sum, average);
    }
}
