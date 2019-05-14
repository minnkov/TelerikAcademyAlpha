package e_Misc;

import java.util.Scanner;

public class Jugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        double quantityToFill = Double.parseDouble(input[1]);

        int currentJugNumber = 1;

        int capacity = 0;

        while (true){

            if (quantityToFill == 0.0) {
                break;
            }

            int jugDetails = capacity + (currentJugNumber - 1);

            if (jugDetails >= quantityToFill) {

                if (currentJugNumber % 2 == 0) {
                    System.out.println(currentJugNumber + 1);
                    break;
                } else {
                    System.out.println(currentJugNumber);
                    break;
                }
            }
            capacity = jugDetails;
            currentJugNumber ++;
        }
    }
}
