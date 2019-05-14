package b_conditionalStatements;

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int humanYears = Integer.parseInt(scanner.nextLine());
        int dogYears = 0;

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1 || i == 2) {
                dogYears += 10;
            } else {
                dogYears += 4;
            }
        }
        System.out.println(dogYears);
    }
}
