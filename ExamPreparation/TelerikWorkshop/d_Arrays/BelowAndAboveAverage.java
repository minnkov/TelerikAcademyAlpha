package d_Arrays;

import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int[] inputNumeric = new int[input.length];

        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            inputNumeric[i] = Integer.parseInt(input[i]);
            sum += inputNumeric[i];
        }

        double average = Math.round((sum / inputNumeric.length) * 100);
        average /= 100;

        int belowAverageCounter = 0;
        int aboveAverageCounter = 0;

        for (int number : inputNumeric) {
            if (number < average) {
                belowAverageCounter++;
            } else if (number > average) {
                aboveAverageCounter++;
            }
        }

        int[] belowAverageList = new int[belowAverageCounter];
        int[] aboveAverageList = new int[aboveAverageCounter];

        int belowAverageIndexer = 0;
        int aboveAverageIndexer = 0;

        for (int number : inputNumeric) {
            if (number < average) {
                belowAverageList[belowAverageIndexer] = number;
                belowAverageIndexer++;
            } else if (number > average) {
                aboveAverageList[aboveAverageIndexer] = number;
                aboveAverageIndexer++;
            }
        }

        System.out.printf("avg: %.2f%n", average);
        System.out.printf("below: ");
        for (int i = 0; i < belowAverageList.length; i++) {
            if (i == belowAverageList.length - 1) {
                System.out.print(belowAverageList[i]);
            } else {
                System.out.print(belowAverageList[i] + ",");
            }
        }
        System.out.printf("%nabove: ");
        for (int i = 0; i < aboveAverageList.length; i++) {
            if (i == aboveAverageList.length - 1) {
                System.out.print(aboveAverageList[i]);
            } else {
                System.out.print(aboveAverageList[i] + ",");
            }
        }
    }
}