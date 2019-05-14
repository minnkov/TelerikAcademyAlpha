package e_Misc;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int h = Integer.parseInt(input[4]);

        int minCircumference = Integer.MAX_VALUE;

        //cases:

        //1. a | d
        int currentCircumference = b + c + 2 * h + d + Math.abs(a - d);
        minCircumference = Math.min(minCircumference, currentCircumference);

        //2. a | h
        currentCircumference = b + c + 2 * d + h + Math.abs(a - h);
        minCircumference = Math.min(minCircumference, currentCircumference);

        //3. b | d
        currentCircumference = a + c + 2 * h + d + Math.abs(b - d);
        minCircumference = Math.min(minCircumference, currentCircumference);

        //4. b | h
        currentCircumference = a + c + 2 * d + h + Math.abs(b - h);
        minCircumference = Math.min(minCircumference, currentCircumference);

        //5. c | d
        currentCircumference = a + b + 2 * h + d + Math.abs(c - d);
        minCircumference = Math.min(minCircumference, currentCircumference);

        //6. c | h
        currentCircumference = a + b + 2 * d + h + Math.abs(c - h);
        minCircumference = Math.min(minCircumference, currentCircumference);

        System.out.println(minCircumference);
    }
}
