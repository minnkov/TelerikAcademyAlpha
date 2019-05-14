package c_Loops;

import java.util.Scanner;

public class PrintDeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardSign = scanner.nextLine();

        int cardSignNumber = 0;

        if (cardSign.equals("A")) {
            cardSignNumber = 14;
        } else if (cardSign.equals("K")) {
            cardSignNumber = 13;
        } else if (cardSign.equals("Q")) {
            cardSignNumber = 12;
        } else if (cardSign.equals("J")) {
            cardSignNumber = 11;
        } else {
            cardSignNumber = Integer.parseInt(cardSign);
        }

        if (cardSignNumber >= 2 && cardSignNumber <= 14) {
            for (int i = 2; i <= cardSignNumber; i++) {
                if (i < 11) {
                    System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
                } else {
                    String outputLetter = "";
                    if (i == 11) {
                        outputLetter = "J";
                    } else if (i == 12) {
                        outputLetter = "Q";
                    } else if (i == 13) {
                        outputLetter = "K";
                    } else if (i == 14) {
                        outputLetter = "A";
                    }
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", outputLetter
                            , outputLetter, outputLetter, outputLetter);
                }
            }
        }
    }
}
