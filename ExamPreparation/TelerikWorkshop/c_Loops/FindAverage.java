package c_Loops;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            sum += number;
        }
        double average = sum / n;

        System.out.printf("%.2f", average);
    }
}
