package c_Loops;

import java.util.Scanner;

public class NotDivisibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
