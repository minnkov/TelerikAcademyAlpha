package e_Misc;

import java.util.Scanner;

public class Mutating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        String[] input = scanner.nextLine().split(" ");

        int fatalMutations = 0;

        for (int i = 0; i < input.length; i++) {

            int numBeforeMutation = Integer.parseInt(input[i]);
            int numAfterMutation = getMutatedNum(input[i]);

            String greatestCommonDivider = String.valueOf(getGCD(numBeforeMutation, numAfterMutation));

            if (greatestCommonDivider.length() == 1) {
                fatalMutations ++;
            }
        }

        System.out.println(fatalMutations);
    }

    private static int getGCD(int numBeforeMutation, int numAfterMutation) {

        int loopRotation = Math.min(numBeforeMutation, numAfterMutation);
        int gcd = 0;

        for (int i = loopRotation; i >= 1 ; i--) {

            if (numBeforeMutation % i == 0 && numAfterMutation % i == 0) {

                gcd = i;
                break;
            }
        }
        return gcd;
    }

    private static int getMutatedNum(String inputNum) {

        String mutatedNum = "";

        for (int i = 0; i < inputNum.length(); i++) {

            int digit = Character.getNumericValue(inputNum.charAt(i));

            if (digit == 9) {
                mutatedNum += "0";
            } else if (digit == 0) {
                mutatedNum += "9";
            } else {

                if (digit % 2 == 0) {
                    digit -= 1;
                } else {
                    digit += 1;
                }

                mutatedNum += String.valueOf(digit);
            }
        }

        return Integer.parseInt(mutatedNum);
    }
}
