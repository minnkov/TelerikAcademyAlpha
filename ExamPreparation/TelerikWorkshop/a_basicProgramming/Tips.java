package a_basicProgramming;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mealPrice = Double.parseDouble(scanner.nextLine());

        double pricePlusTip = mealPrice * 1.10;

        System.out.printf("%.0f", pricePlusTip);

    }
}
