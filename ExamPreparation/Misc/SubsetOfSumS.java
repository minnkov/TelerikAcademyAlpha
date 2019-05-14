package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfSumS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean hasSumOfS = false;

        georgi:
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = i; j < array.length; j++) {
                if (sum < s) {
                    sum += array[j];
                } else if (sum == s) {
                    hasSumOfS = true;
                    break georgi;
                } else {
                    break;
                }
            }
        }
        if (hasSumOfS) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
