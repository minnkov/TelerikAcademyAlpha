package e_Misc;

import java.util.*;
import java.util.stream.Collectors;

public class Ranks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> sortedList = inputList.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toList());

        int rank = 1;

        List<Integer> outputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            outputList.add(0);
        }

        for (Integer sortedNum : sortedList) {
            int indexTemp = inputList.indexOf(sortedNum);
            outputList.set(indexTemp, rank);
            rank++;
        }

        for (Integer num : outputList) {
            System.out.print(num + " ");
        }
    }
}
