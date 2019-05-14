package d_Arrays;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(",");
        int[] inputNumeric = new int[inputString.length];

        for (int i = 0; i < inputString.length; i++) {
            inputNumeric[i] = Integer.parseInt(inputString[i]);
        }

        int[] outputNumeric = new int[inputNumeric.length];
        int outputIndexer = 0;

        for (int number : inputNumeric) {
            if (number != 0) {
                outputNumeric[outputIndexer] = number;
                outputIndexer++;
            }
        }
        for (int i = 0; i < outputNumeric.length; i++) {

            if (i == outputNumeric.length - 1) {
                System.out.print(outputNumeric[i]);
            } else {
                System.out.print(outputNumeric[i] + ",");
            }
        }
    }
}
