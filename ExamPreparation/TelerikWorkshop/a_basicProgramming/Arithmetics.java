package a_basicProgramming;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int remainder = a % b;
        double powered = Math.pow(a, b);

        System.out.printf("%d%n%d%n%d%n%d%n%.0f%n",Math.abs(sum), Math.abs(difference), Math.abs(product),
                Math.abs(remainder), Math.abs(powered));

    }
}
