package e_Misc;

import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = 5 * i;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
