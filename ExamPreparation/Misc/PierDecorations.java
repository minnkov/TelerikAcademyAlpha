package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PierDecorations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String[] weightsInput = scanner.nextLine().split(" ");

        List<Integer> weights = new ArrayList<>();

        for (int i = 0; i < weightsInput.length; i++) {
            weights.add(Integer.parseInt(weightsInput[i]));
        }

        weights = weights.stream()
                .sorted((left, right) -> Integer.compare(right, left))
                .collect(Collectors.toList());

        int difference = 0;

        int indexer = 0;

        while (weights.size() > 1) {

            int firstNum = weights.get(indexer);
            int secondNum = weights.get(indexer + 1);
            difference = firstNum - secondNum;

            if (difference < 0) {
                difference = Math.abs(difference);
            }

            weights.set(indexer, difference);
            weights.remove(indexer + 1);

            weights = weights.stream()
                    .sorted((left, right) -> Integer.compare(right, left))
                    .collect(Collectors.toList());
        }

        System.out.println(weights.get(0));
    }
}
