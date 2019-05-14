package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersToN = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbersToN.add(i);
        }

        System.out.println(numbersToN);
    }
}
