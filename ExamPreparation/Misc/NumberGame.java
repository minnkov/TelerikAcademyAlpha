package e_Misc;

import java.util.*;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int mainNum = Integer.parseInt(input[1]);

        List<Integer> mainNumDividers = new ArrayList<>();

        for (int i = 2; i <= mainNum; i++) {

            if (mainNum % i == 0) {
                mainNumDividers.add(i);
            }
        }

        String[] secondaryNums = scanner.nextLine().split(" ");

        Map<Integer, Integer> elephantIndexesAndPoints = new LinkedHashMap<>();

        for (int i = 0; i < secondaryNums.length; i++) {

            int points = 0;

            int tempNum = Integer.parseInt(secondaryNums[i]);

            List<Integer> tempNumDividers = new ArrayList<>();

            for (int j = 2; j <= tempNum; j++) {

                if (tempNum % j == 0) {
                    tempNumDividers.add(j);

                }
            }

            for (Integer mainNumDivider : mainNumDividers) {

                for (int j = 0; j < tempNumDividers.size(); j++) {

                    int dividerTemp = tempNumDividers.get(j);

                    if (dividerTemp == mainNumDivider) {
                        points++;
                        break;
                    }
                }
            }

            elephantIndexesAndPoints.put(i + 1, points);

        }

        elephantIndexesAndPoints = elephantIndexesAndPoints.entrySet().stream()
                .sorted((left, right) -> {

                    int sort = Integer.compare(right.getValue(), left.getValue());

                    if (sort == 0) {
                        sort = Integer.compare(left.getKey(), right.getKey());
                    }
                    return sort;
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

        int maxPoints = 0;
        int iterator = 0;

        for (Map.Entry<Integer, Integer> kvp : elephantIndexesAndPoints.entrySet()) {

            if (iterator == 0) {
                maxPoints = kvp.getValue();

                if (maxPoints == 0) {
                    System.out.println("No winners");
                    break;
                }

                System.out.println(kvp.getValue());
                System.out.print(kvp.getKey());
                iterator++;
                continue;
            }


            if (kvp.getValue() == maxPoints) {
                System.out.print(" " + kvp.getKey());
            } else {
                break;
            }
        }

    }
}
