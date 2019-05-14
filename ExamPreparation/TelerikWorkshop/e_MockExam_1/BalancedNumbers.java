package e_Misc;

import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.length() > 3 || input.length() < 1) {
                break;
            }
            //check if number is balanced

            if (Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(2))
                    != Character.getNumericValue(input.charAt(1))) {
                break;
            }

            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
