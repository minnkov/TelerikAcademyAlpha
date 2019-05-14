package e_Misc;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = reverseDigits(input);
        System.out.println(output);
    }

    private static String reverseDigits(String input) {

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
