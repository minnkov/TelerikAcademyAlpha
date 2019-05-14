package e_Misc;

import java.util.Scanner;

public class Krachkomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int milesInput = Integer.parseInt(scanner.nextLine());

        int inputInKm = milesInput * 1609;

        System.out.println(inputInKm);
    }
}
