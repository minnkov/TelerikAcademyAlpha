package b_conditionalStatements;

import java.util.Scanner;

public class ChessSquareColor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();
        int rank = Integer.parseInt(scanner.nextLine());

        if (file.equals("a") || file.equals("c") || file.equals("e") || file.equals("g")) {
            if (rank % 2 == 0) {
                System.out.println("light");
            } else {
                System.out.println("dark");
            }
        } else {
            if (rank % 2 == 0) {
                System.out.println("dark");
            } else {
                System.out.println("light");
            }
        }
    }
}
