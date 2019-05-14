package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLargestThanNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        printFirstLargerThanNeighboursIndex(numbers);
    }

    private static void printFirstLargerThanNeighboursIndex(int[] numbers) {

        int index = -1;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i-1] && numbers[i] > numbers[i + 1]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
