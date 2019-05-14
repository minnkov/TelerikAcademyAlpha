package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<String> output = new ArrayList<>();

        for (int i = input.length - 1; i >= 0 ; i--) {

            output.add(input[i]);
        }

        System.out.println(output.toString().replaceAll("[\\[\\]]", ""));
    }
}
