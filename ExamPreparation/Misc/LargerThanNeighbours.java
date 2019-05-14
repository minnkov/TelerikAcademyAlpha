package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class LargerThanNeighbours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        printLargerThanNeighboursCount(numbers);
    }

    private static void printLargerThanNeighboursCount(int[] numbers) {

        int counter = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i-1] && numbers[i] > numbers[i + 1]) {
                counter++;
                i++;
            }
        }
        System.out.println(counter);
    }
}
