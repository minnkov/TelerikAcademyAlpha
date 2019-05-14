package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i <= input[0] ; i++) {

        }
    }
}
