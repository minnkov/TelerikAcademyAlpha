package e_Misc;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        boolean isInvalid = false;

        if (score < 1 || score > 9) {
            System.out.println("invalid score");
            return;
        } else if (score >= 1 && score <= 3) {
            score *= 10;
        } else if (score >= 4 && score <= 6) {
            score *= 100;
        } else if (score >= 7 && score <= 9) {
            score *= 1000;
        }

        System.out.println(score);
    }
}
