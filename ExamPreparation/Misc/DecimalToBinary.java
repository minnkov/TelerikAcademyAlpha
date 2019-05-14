package e_Misc;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = Long.parseLong(scanner.nextLine());

        String output = "";

        if (input == 0) {

            System.out.println("0");

        } else {

            while (input >= 1) {

                long binaryNum = input % 2;
                output = binaryNum + output;
                input /= 2;
            }
            System.out.println(output);
        }
    }
}
