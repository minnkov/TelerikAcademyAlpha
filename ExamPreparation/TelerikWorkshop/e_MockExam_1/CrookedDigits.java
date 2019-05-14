package e_Misc;

import java.math.BigDecimal;
import java.util.Scanner;

public class CrookedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        BigDecimal sum = new BigDecimal(input);

        if (sum.compareTo(BigDecimal.valueOf(0)) < 0) {
            sum = sum.abs();
        }

        if (input.length() == 1) {
            System.out.println(input);
        } else {
            while (sum.compareTo(BigDecimal.valueOf(9)) == 1) {
                input = String.valueOf(sum);
                sum = BigDecimal.valueOf(0);

                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '.' || input.charAt(i) == '-') {
                        continue;
                    }
                    sum = sum.add(BigDecimal.valueOf(Character.getNumericValue(input.charAt(i))));
                }
            }
            input = String.valueOf(sum);

            System.out.println(input);
        }


    }
}
