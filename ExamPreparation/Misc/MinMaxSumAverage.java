package e_Misc;

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {

            double currentNum = Double.parseDouble(scanner.nextLine());

            if (currentNum < min) {
                min = currentNum;
            }
            if (currentNum > max) {
                max = currentNum;
            }

            sum += currentNum;
            avg += currentNum;
        }
        avg = avg / n;

        System.out.printf("min=%.2f\n" +
                "max=%.2f\n" +
                "sum=%.2f\n" +
                "avg=%.2f", min, max, sum, avg);
    }
}
