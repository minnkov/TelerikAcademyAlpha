package d_Arrays;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");
        String[] outputNumbers = new String[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            outputNumbers[inputNumbers.length - 1 - i] = inputNumbers[i];
        }
        System.out.println(String.join(", ", outputNumbers));
    }
}
