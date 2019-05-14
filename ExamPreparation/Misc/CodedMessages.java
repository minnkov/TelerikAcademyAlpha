package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodedMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        if (input.length < 2) {
            System.out.println(String.join("", input));
            return;
        }

        List<String> output = new ArrayList<>();

        String firstWordToAdd = input[0] + input[1] + input[0];

        output.add(firstWordToAdd);

        for (int i = 2; i < input.length; i++) {

            String wordToAdd = input[i] + String.join("", output);

            output.add(wordToAdd);
        }

        System.out.println(String.join("", output));
    }
}
