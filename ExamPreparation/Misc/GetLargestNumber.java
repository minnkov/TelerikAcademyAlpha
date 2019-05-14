package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class GetLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

//        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        int maxOfFirstTwo = getMax(inputNumbers[0], inputNumbers[1]);
//        int maxValue = getMax(maxOfFirstTwo, inputNumbers[2]);
//        System.out.println(maxValue);

    }

    private static int getMax(int inputNumber, int inputNumber1) {
        if (inputNumber >= inputNumber1) {
            return inputNumber;
        } else {
            return inputNumber1;
        }
    }
}
