package e_Misc;

import java.util.Scanner;

public class LongestIncreasingSequence_yolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int longestSequence = 0;
        int currentSequence = 1;
        int currentNum = 0;
        int nextNum = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                currentNum = Integer.parseInt(scanner.nextLine());
            } else {
                nextNum = Integer.parseInt(scanner.nextLine());
            }

            if (currentNum < nextNum) {
                currentSequence++;
            } else {
                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                    currentSequence = 1;
                } else {
                    currentSequence = 1;
                }
            }
            if (i != 0) {
                currentNum = nextNum;
            }
        }
        System.out.println(longestSequence);
    }
}