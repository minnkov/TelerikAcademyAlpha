package e_Misc;

import java.util.Scanner;

public class PotSort_YoLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] potHeights = scanner.nextLine().split(" ");

        int a = Integer.parseInt(potHeights[0]);
        int b = Integer.parseInt(potHeights[1]);
        int c = Integer.parseInt(potHeights[2]);
        int d = Integer.parseInt(potHeights[3]);

        if (a > b && b > c && c > d) {
            System.out.println("Descending");
        } else if (d > c && c > b && b > a) {
            System.out.println("Ascending");
        } else {
            System.out.println("Mixed");
        }
    }
}
