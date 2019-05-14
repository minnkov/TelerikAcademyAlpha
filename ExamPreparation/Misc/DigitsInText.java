package e_Misc;

import java.util.Scanner;

public class DigitsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumOfDigits = 0;

        boolean noDigitsInText = true;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                noDigitsInText = false;
                sumOfDigits += Character.getNumericValue(input.charAt(i));
            }
        }

        if (noDigitsInText) {
            System.out.println(-1);
        } else {
            System.out.println(sumOfDigits);
        }
    }
}
