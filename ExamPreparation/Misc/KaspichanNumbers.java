package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class KaspichanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll(" ", "");

        BigInteger number = new BigInteger(input);

        String output = "";

        if (number.compareTo(BigInteger.valueOf(25)) <= 0) {

            int tempNum = number.intValue() + 65;

            char value = (char) tempNum;

            output += value;
        } else {

            int lastDigitCharCode = number.remainder(BigInteger.valueOf(26)).add(BigInteger.valueOf(65)).intValue();

            char value = (char) lastDigitCharCode;

            output += value;

            number = number.subtract(BigInteger.valueOf(lastDigitCharCode - 65));

            //todo while number > 255

            while (number.compareTo(BigInteger.valueOf(255)) > 0) {



            }
        }

        System.out.println(output);
    }
}
