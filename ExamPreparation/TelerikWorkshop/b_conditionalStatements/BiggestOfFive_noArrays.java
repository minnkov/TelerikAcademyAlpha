package b_conditionalStatements;

import java.util.Scanner;

public class BiggestOfFive_noArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());
        double fourthNumber = Double.parseDouble(scanner.nextLine());
        double fifthNumber = Double.parseDouble(scanner.nextLine());

        double biggestNumber = 0;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber && firstNumber >= fourthNumber
                && firstNumber >= fifthNumber) {
            biggestNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber
                && secondNumber > fifthNumber) {
            biggestNumber = secondNumber;
        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber && thirdNumber > fourthNumber
                && thirdNumber > fifthNumber) {
            biggestNumber = thirdNumber;
        } else if (fourthNumber > secondNumber && fourthNumber > firstNumber && fourthNumber > thirdNumber
                && fourthNumber > fifthNumber) {
            biggestNumber = fourthNumber;
        } else {
            biggestNumber = fifthNumber;
        }

        if (biggestNumber % 1 == 0) {
            System.out.printf("%.0f", biggestNumber);
        } else {
            System.out.print(biggestNumber);
        }
    }
}
