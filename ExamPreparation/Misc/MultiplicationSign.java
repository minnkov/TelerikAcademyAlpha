package e_Misc;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minusCounter = 0;
        boolean isZero = false;

        for (int i = 0; i < 3; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 0) {
                minusCounter++;
            } else if (number == 0) {
                isZero = true;
            }
        }

        if (isZero) {
            System.out.println("0");
        } else if (minusCounter == 0 || minusCounter % 2 == 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
