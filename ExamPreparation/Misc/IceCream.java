package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int numberOfElephants = Integer.parseInt(input[0]);

        int[] numberDigits = Arrays.stream(input[1].split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 0;

        if (numberDigits.length < numberOfElephants) {
            counter = numberOfElephants - numberDigits.length;
        }

        int indexer = 0;

        for (int i = 0; i < numberOfElephants; i++) {

            if (i < numberDigits.length) {
                if (numberDigits[i] == 0) {
                    counter ++;
                }
                indexer++;
            }
        }

        if (counter > 0 && ((numberDigits.length - 1) > indexer) ) {

            for (int i = indexer; i < numberDigits.length; i++) {

                if (numberDigits[i] != 0) {
                    counter--;
                }

                if (counter <= 0) {
                    counter = 0;
                    break;
                }
            }
        }

        System.out.println(counter);
    }
}
