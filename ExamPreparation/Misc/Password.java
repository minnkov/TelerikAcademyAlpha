package e_Misc;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String n = input[0];
        int k = Integer.parseInt(input[1]);
        String newN = "";

        for (int i = n.length() - 1; i >= 0 ; i--) {

            newN += String.valueOf(n.charAt(i));

        }

        int number = Integer.parseInt(newN);

        int output = (number / k) + (number % k);

        System.out.println(output);
    }
}
