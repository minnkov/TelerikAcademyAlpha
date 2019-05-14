package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpellCaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int totalCharCount = 0;

        for (String word : input) {
            int charCount = word.length();
            totalCharCount += charCount;
        }

        List<Character> extractedInput = new ArrayList<>();

        while (extractedInput.size() < totalCharCount) {

            for (int i = 0; i < input.length; i++) {

                if (input[i].length() > 0) {
                    String newWord = "";

                    extractedInput.add(input[i].charAt(input[i].length() - 1));

                    for (int j = 0; j < input[i].length() - 1; j++) {
                        newWord += input[i].charAt(j);
                    }

                    input[i] = newWord;
                } else {
                    continue;
                }
            }
        }

        for (int i = 0; i < extractedInput.size(); i++) {

            char charToMove = extractedInput.get(i);
            char temp = Character.toLowerCase(extractedInput.get(i));
            int positionsToMoveBy = temp - 96;
            int destinationIndex = i + positionsToMoveBy;

            if (destinationIndex >= extractedInput.size()) {
                destinationIndex = destinationIndex % extractedInput.size();
            }

            extractedInput.remove(i);
            extractedInput.add(destinationIndex, charToMove);
        }

        System.out.println(extractedInput.toString().replaceAll("[, \\[\\]]", ""));
    }
}
