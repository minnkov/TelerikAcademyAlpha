package g_MockExam_2;

import java.util.Scanner;

public class Speeds_take2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        int longestGroupSize = 0;
        int longestGroupSpeedSum = 0;

        int previousCarSpeed = Integer.parseInt(scanner.nextLine());

        int currentGroupSize = 1;
        int currentGroupSpeedSum = previousCarSpeed;

        for (int i = 0; i < numberOfCars - 1; i++) {

            int currentCarSpeed = Integer.parseInt(scanner.nextLine());

            if (currentCarSpeed > previousCarSpeed) {
                currentGroupSize ++;
                currentGroupSpeedSum += currentCarSpeed;

                if (currentGroupSize > longestGroupSize) {
                    longestGroupSize = currentGroupSize;
                    longestGroupSpeedSum = currentGroupSpeedSum;
                } else if (currentGroupSize == longestGroupSize) {
                    if (currentGroupSpeedSum > longestGroupSpeedSum) {
                        longestGroupSpeedSum = currentGroupSpeedSum;
                    }
                }
            } else if (currentCarSpeed == previousCarSpeed) {
                currentGroupSize = 1;
                currentGroupSpeedSum = currentCarSpeed;

                if (currentGroupSize > longestGroupSize) {
                    longestGroupSize = currentGroupSize;
                    longestGroupSpeedSum = currentGroupSpeedSum;
                } else if (currentGroupSize == longestGroupSize) {
                    if (currentGroupSpeedSum > longestGroupSpeedSum) {
                        longestGroupSpeedSum = currentGroupSpeedSum;
                    }
                }
            } else if (currentCarSpeed < previousCarSpeed) {

                currentGroupSize = 1;

                if (currentGroupSize > longestGroupSize) {
                    longestGroupSize = currentGroupSize;
                    longestGroupSpeedSum = currentGroupSpeedSum;
                } else if (currentGroupSize == longestGroupSize) {
                    if (currentGroupSpeedSum > longestGroupSpeedSum) {
                        longestGroupSpeedSum = currentGroupSpeedSum;
                    }
                }
                previousCarSpeed = currentCarSpeed;
                currentGroupSpeedSum = currentCarSpeed;
            }
        }

        System.out.println(longestGroupSpeedSum);
    }
}
