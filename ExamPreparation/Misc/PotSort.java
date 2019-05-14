package e_Misc;

import java.util.Scanner;

public class PotSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] potHeights = scanner.nextLine().split(" ");

        int descendingSortIndex = potHeights.length - 1;

        boolean isAccending = true;
        boolean isDescending = true;

        for (int i = 0; i < potHeights.length - 1; i++) {

            //ascending sort check
            if (Integer.parseInt(potHeights[i + 1]) <= Integer.parseInt(potHeights[i])) {
                isAccending = false;
            }

            //descending sort check
            if (Integer.parseInt(potHeights[descendingSortIndex]) >= Integer.parseInt(potHeights[descendingSortIndex - 1])) {
                isDescending = false;
            }

            if (!isAccending && !isDescending) {
                System.out.println("Mixed");
                return;
            }

            descendingSortIndex--;
        }

        if (isAccending) {
            System.out.println("Ascending");
        } else if (isDescending) {
            System.out.println("Descending");
        }
    }
}
