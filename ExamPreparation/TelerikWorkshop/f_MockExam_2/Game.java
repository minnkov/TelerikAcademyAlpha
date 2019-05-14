package g_MockExam_2;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int x = Character.getNumericValue(input.charAt(0));
        int y = Character.getNumericValue(input.charAt(1));
        int z = Character.getNumericValue(input.charAt(2));

        int result = Integer.MIN_VALUE;

        result = Math.max(result, x + y + z);
        result = Math.max(result, x + y * z);
        result = Math.max(result, x * y + z);
        result = Math.max(result, x * y * z);

        System.out.println(result);
    }
}