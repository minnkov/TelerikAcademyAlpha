package e_Misc;

import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            try {
                int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            } catch (Exception e) {
                output += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
