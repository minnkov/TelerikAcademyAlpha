package c_Loops;

import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            int number = i;
            for (int j = 0; j < n; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
