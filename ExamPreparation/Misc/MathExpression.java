package e_Misc;

import java.util.Scanner;

public class MathExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());

        double topPart = Math.pow(n, 2) + (1.0 / (m * p)) + 1337;
        double bottomPart = (n - (128.523123123 * p));
        double sinusPart = (Math.sin((int)(m % 180)));

        double result = topPart / bottomPart + sinusPart;

        System.out.printf("%.6f\n", result);

    }
}
