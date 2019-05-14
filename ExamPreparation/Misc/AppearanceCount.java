package e_Misc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class AppearanceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] numbers = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());

        long counter = Arrays.stream(numbers)
                .map(Integer::parseInt)
                .filter(Predicate.isEqual(number))
                .count();

        System.out.println(counter);

    }
}
