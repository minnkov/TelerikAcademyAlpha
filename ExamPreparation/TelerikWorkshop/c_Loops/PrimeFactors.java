package c_Loops;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {

            int dividerCounter = 0;
            for (int j = 1; j <= i; j++) {
                   if (i % j == 0) {
                       dividerCounter++;
                   }
            }
            if (dividerCounter == 2 && n % i == 0) {
                while (n % i == 0){
                    System.out.println(i + " ");
                    n /= i;
                }
            }
        }
    }
}
