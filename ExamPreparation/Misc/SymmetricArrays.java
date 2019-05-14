package e_Misc;

import java.util.Scanner;

public class SymmetricArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            checkIfArrayIsSymetricAndLetMeKnow(input);
        }
    }

    private static void checkIfArrayIsSymetricAndLetMeKnow(String[] input) {

        for (int i = 0; i < input.length / 2; i++) {

            if (input[i].equals(input[input.length - 1 - i])) {
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
