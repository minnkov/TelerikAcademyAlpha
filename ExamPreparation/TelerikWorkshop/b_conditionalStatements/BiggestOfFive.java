package b_conditionalStatements;

import java.util.Scanner;

public class BiggestOfFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbersArray = new double[5];
        double biggestNumber = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Double.parseDouble(scanner.nextLine());
        }

        for (int i = 0; i < numbersArray.length; i++) {

            for (int j = 0; j < numbersArray.length; j++) {
                if (i == 0 && numbersArray[i] >= numbersArray[j] ) {
                    biggestNumber = numbersArray[i];
                } else if (i != 0 && numbersArray[i] > numbersArray[j] && numbersArray[i] > biggestNumber) {
                    biggestNumber = numbersArray[i];
                }
            }
        }

        if (biggestNumber % 1 == 0) {
            System.out.printf("%.0f", biggestNumber);
        } else {
            System.out.print(biggestNumber);
        }
    }
}
