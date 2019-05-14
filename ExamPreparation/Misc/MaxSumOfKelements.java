package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfKelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[n];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(numArray);

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += numArray[numArray.length - 1 - i];
        }

        System.out.println(sum);
    }
}
