package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SignalFromSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        List<Character> output = new ArrayList<>();

        char temp = 'g';

        for (int i = 0; i < input.length; i++) {

            if (i == 0) {
                temp = input[i];
                output.add(temp);
            } else {
                if (input[i] == temp) {
                    continue;
                } else {
                    temp = input[i];
                    output.add(temp);
                }
            }
        }
        System.out.println(output.toString().replaceAll("[, \\[\\]]", ""));
    }
}
