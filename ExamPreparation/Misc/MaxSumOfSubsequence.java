package e_Misc;

import java.util.Scanner;

public class MaxSumOfSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int maxSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentSum = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                currentSum += numbers[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}