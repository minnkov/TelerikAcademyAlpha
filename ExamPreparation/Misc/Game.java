package e_Misc;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int biggestOutput = 0;
        int onesCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));

            if (digit == 1) {
                onesCounter++;
                continue;
            } else if (digit == 0) {
                continue;
            } else {
                if (biggestOutput == 0) {
                    biggestOutput = 1;
                }
                biggestOutput *= digit;
            }
        }
        System.out.println(biggestOutput + onesCounter);
    }
}
