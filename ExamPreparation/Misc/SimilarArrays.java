package e_Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimilarArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .sorted()
                .toArray();

        String m = scanner.nextLine();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .sorted()
                .toArray();

        List<Integer> numsFromFirstArrayMissingInSecond = new ArrayList<>();

        boolean areSimilar = true;

        for (int i = 0; i < firstArray.length; i++) {
            int tempNum = firstArray[i];

            boolean isContained = false;

            for (int j = 0; j < secondArray.length; j++) {
                int tempNum2 = secondArray[j];

                if (tempNum == tempNum2) {
                    isContained = true;
                    break;
                }
            }

            if (!isContained) {
                numsFromFirstArrayMissingInSecond.add(tempNum);
                areSimilar = false;
            }
        }

        if (areSimilar) {
            System.out.println(firstArray.length);
        } else {
            System.out.println(numsFromFirstArrayMissingInSecond.toString().replaceAll("[,\\[\\]]", ""));
        }
    }
}
