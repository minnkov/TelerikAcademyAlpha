package e_Misc;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = Long.parseLong(scanner.nextLine());

        String output = "";

        if (input == 0) {

            System.out.println("0");

        } else {

            while (input >= 1) {

                long decimalNum = input % 16;
                String hexNum = "";

                if (decimalNum <= 9) {
                    hexNum = String.valueOf(decimalNum);
                } else {
                    long asciiValue = 64 + (decimalNum - 9);
                    char temp = (char) asciiValue;
                    hexNum = String.valueOf(temp);
                }

                output = hexNum + output;
                input /= 16;
            }
            System.out.println(output);
        }
    }
}
