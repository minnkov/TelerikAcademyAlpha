package e_Misc;

import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int legs = Integer.parseInt(scanner.nextLine());

        //chickens - 7 legs; bears - 2 legs; humans - 5 legs;

        int combinations = 0;

        for (int i = 0; i <= legs; i++) {

            int tempA = i * 2;

            for (int j = 0; j <= legs; j++) {

                int tempB = j * 5;

                if (tempB > legs) {
                    break;
                }

                for (int k = 0; k <= legs; k++) {

                    int tempC = k * 7;

                    if (tempC > legs) {
                        break;
                    }

                    if (tempA + tempB + tempC == legs) {
                        combinations++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}