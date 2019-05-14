package e_Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckForPlayCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        List<String> cardsList = new ArrayList<>(Arrays.asList(cards));

        if (cardsList.contains(input)) {
            System.out.println("yes " + input);
        } else {
            System.out.println("no " + input);
        }
    }
}
