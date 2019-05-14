package d_Arrays;

import java.util.Scanner;

public class ReverseNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");

        for (int i = 0; i < inputNumbers.length / 2; i++) {
            String currentNumber = inputNumbers[i];
            inputNumbers[i] = inputNumbers[inputNumbers.length - 1 - i];
            inputNumbers[inputNumbers.length - 1 - i] = currentNumber;
        }
        System.out.println(String.join(", ", inputNumbers));
    }
}
