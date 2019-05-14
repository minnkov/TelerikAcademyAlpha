package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crosswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nAndM = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);

        List<String> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String line = "";

            for (int j = 0; j < input.length(); j++) {
                line += input.charAt(j);
            }

            lines.add(line.trim());
        }

        List<String> columns = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            String column = "";

            for (int j = 0; j < n; j++) {

                column += lines.get(j).charAt(i);
            }

            columns.add(column.trim());

        }

        List<String> validWords = getValidWords(lines, columns);

        validWords.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

    }

    private static List<String> getValidWords(List<String> lines, List<String> columns) {
        List<String> validWords = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {

            String line = lines.get(i);

            String word = "";

            for (int j = 0; j < line.length(); j++) {
                char character = line.charAt(j);

                if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
                    word += character;
                } else {
                    if (word.length() >= 2) {
                        validWords.add(word);
                    }
                    word = "";

                }
            }
            if (word.length() >= 2) {
                validWords.add(word);
            }
        }

        for (int i = 0; i < columns.size(); i++) {

            String column = columns.get(i);

            String word = "";

            for (int j = 0; j < column.length(); j++) {
                char character = column.charAt(j);

                if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
                    word += character;
                } else {
                    if (word.length() >= 2) {
                        validWords.add(word);
                    }
                    word = "";

                }
            }
            if (word.length() >= 2) {
                validWords.add(word);
            }
        }

        return validWords;
    }
}
