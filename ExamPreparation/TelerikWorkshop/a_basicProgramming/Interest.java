package a_basicProgramming;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depositedSum = Integer.parseInt(scanner.nextLine());
        double afterInterest = depositedSum;

        for (int i = 0; i < 3; i++) {
            afterInterest *= 1.05;
            System.out.printf("%.2f%n", afterInterest);
        }
    }
}
