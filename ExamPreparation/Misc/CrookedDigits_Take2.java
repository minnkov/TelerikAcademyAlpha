package e_Misc;

import java.util.Scanner;

public class CrookedDigits_Take2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;

        if (input.length() == 1) {
            System.out.println(input);
        } else {

            while (true) {
                sum = 0;

                for (int i = 0; i < input.length(); i++) {

                    if (input.charAt(i) == '-' || input.charAt(i) == '.') {
                        continue;
                    }
                    sum+= Character.getNumericValue(input.charAt(i));
                }
                if (sum > 9) {
                    input = String.valueOf(sum);
                } else {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}