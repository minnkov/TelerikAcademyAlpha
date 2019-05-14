package d_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        Arrays.sort(numbers);
        Arrays.sort(inputNumbers);

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.printf("%d", numbers[i]);
            } else {
                System.out.printf("%d, ", numbers[i]);
            }
        }
    }
}
