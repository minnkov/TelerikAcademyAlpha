package c_Loops;

import java.util.Scanner;

public class CalculateComplexSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());

        double sum = 1.0;

        for (int i = 1; i <= n; i++) {
            double factoriel = 1.0;
            double divider = Math.pow(x, i);
            for (int j = 1; j <= i; j++) {
                factoriel = factoriel * j;
            }
            sum += factoriel / divider;
        }
        System.out.printf("%.5f", sum);
    }
}
