package c_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestThreeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(numbers);

        System.out.printf("%d, %d and %d", numbers[numbers.length - 1], numbers[numbers.length - 2], numbers[numbers.length - 3]);

    }
}
