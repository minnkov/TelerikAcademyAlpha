package d_Arrays;

import java.util.Scanner;

public class CombineLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstList = scanner.nextLine().split(",");
        String[] secondList = scanner.nextLine().split(",");
        String[] combinedList = new String[firstList.length + secondList.length];

        for (int i = 0; i < firstList.length; i++) {
            if (i == 0) {
                combinedList[i] = firstList[i];
                combinedList[i + 1] = secondList[i];
            } else {
                combinedList[i + i] = firstList[i];
                combinedList[i + i + 1] = secondList[i];
            }
        }
        System.out.println(String.join(",", combinedList));
    }
}
