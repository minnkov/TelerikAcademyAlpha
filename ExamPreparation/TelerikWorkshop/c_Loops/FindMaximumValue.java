package c_Loops;

import java.util.Scanner;

public class FindMaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println(biggestNumber);
    }
}
