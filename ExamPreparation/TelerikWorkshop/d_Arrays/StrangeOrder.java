package d_Arrays;

import java.util.Scanner;

public class StrangeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int[] inputNumeric = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            inputNumeric[i] = Integer.parseInt(input[i]);
        }

        int negativeCounter = 0;
        int zeroCounter = 0;
        int positiveCounter = 0;

        for (int number : inputNumeric) {
            if (number < 0) {
                negativeCounter++;
            } else if (number > 0) {
                positiveCounter++;
            } else {
                zeroCounter++;
            }
        }

        int[] outputNumeric = new int[input.length];

        int negativeStartIndex = 0;
        int negativeEndIndex = negativeStartIndex + negativeCounter - 1;
        int zeroStartIndex = negativeEndIndex + 1;
        int zeroEndIndex = negativeEndIndex + zeroCounter;
        int positiveStartIndex = zeroEndIndex + 1;
        int positiveEndIndex = zeroEndIndex + positiveCounter;

        int negativeIndexCounter = 0;
        int positiveIndexCounter = 0;

        for (int i = 0; i < inputNumeric.length; i++) {
            if (i <= negativeEndIndex) {
                if (inputNumeric[i] > 0) {
                    outputNumeric[positiveStartIndex + positiveIndexCounter] = inputNumeric[i];
                    positiveIndexCounter++;
                } else if (inputNumeric[i] < 0) {
                    outputNumeric[negativeStartIndex + negativeIndexCounter] = inputNumeric[i];
                    negativeIndexCounter++;
                }
            } else if (i >= zeroStartIndex && i <= zeroEndIndex) {
                if (inputNumeric[i] > 0) {
                    outputNumeric[positiveStartIndex + positiveIndexCounter] = inputNumeric[i];
                    positiveIndexCounter++;
                } else if (inputNumeric[i] < 0) {
                    outputNumeric[negativeStartIndex + negativeIndexCounter] = inputNumeric[i];
                    negativeIndexCounter++;
                }
            } else if (i >= positiveStartIndex) {
                if (inputNumeric[i] < 0) {
                    outputNumeric[negativeStartIndex + negativeIndexCounter] = inputNumeric[i];
                    negativeIndexCounter++;
                } else if (inputNumeric[i] > 0) {
                    outputNumeric[positiveStartIndex + positiveIndexCounter] = inputNumeric[i];
                    positiveIndexCounter++;
                }
            }
        }

        for (int i = 0; i < outputNumeric.length; i++) {
            if (i == outputNumeric.length - 1) {
                System.out.printf("%d", outputNumeric[i]);

            } else {
                System.out.printf("%d,", outputNumeric[i]);
            }
        }
    }
}
