package a_basicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i : number) {
            sum += i;
        }
        System.out.println(sum);
    }
}
