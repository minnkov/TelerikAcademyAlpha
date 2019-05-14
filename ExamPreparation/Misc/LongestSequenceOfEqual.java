package e_Misc;

import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[n];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(scanner.nextLine());
        }

        int longestSequence = 0;

        for (int i = 0; i < numArray.length; i++) {
            int sequenceCounter = 1;

            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    sequenceCounter++;
                } else {
                    i = j - 1;
                    break;
                }
            }

            if (sequenceCounter > longestSequence) {
                longestSequence = sequenceCounter;
            }
        }
        System.out.println(longestSequence);
    }
}
