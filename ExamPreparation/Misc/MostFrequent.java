package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(numbers);

        int maxFrequency = 0;
        int longestFrequencyNumber = 0;
        int currentNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentNumber = numbers[i];
            int currentFrequency = 1;

            for (int j = i + 1; j < numbers.length; j++) {

                if (currentNumber == numbers[j]) {
                    currentFrequency++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                longestFrequencyNumber = currentNumber;
            }
        }
        System.out.printf("%d (%d times)", longestFrequencyNumber, maxFrequency);
    }
}