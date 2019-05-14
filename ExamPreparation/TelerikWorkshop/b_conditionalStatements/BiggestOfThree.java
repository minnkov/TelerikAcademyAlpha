package b_conditionalStatements;

import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            if (firstNumber % 1 == 0) {
                System.out.printf("%.0f", firstNumber);
            } else {
                System.out.print(firstNumber);
            }
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            if (secondNumber % 1 == 0) {
                System.out.printf("%.0f", secondNumber);
            } else {
                System.out.print(secondNumber);
            }
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if (thirdNumber % 1 == 0) {
                System.out.printf("%.0f", thirdNumber);
            } else {
                System.out.print(thirdNumber);
            }
        }
    }
}
