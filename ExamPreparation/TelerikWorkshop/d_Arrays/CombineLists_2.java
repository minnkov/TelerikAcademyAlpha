package d_Arrays;

import java.util.Scanner;

public class CombineLists_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstList = scanner.nextLine().split(",");
        String[] secondList = scanner.nextLine().split(",");

        for (int i = 0; i < firstList.length; i++) {
            System.out.print(firstList[i] + ",");
            if (i == firstList.length - 1) {
                System.out.println(secondList[i]);
            } else {
                System.out.print(secondList[i] + ",");
            }
        }
    }
}
