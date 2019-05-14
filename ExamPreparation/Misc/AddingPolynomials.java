package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddingPolynomials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstPolynomial = scanner.nextLine().split(" ");
        String[] secondPolynomial = scanner.nextLine().split(" ");

        List<Integer> polynomSummed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numberToAdd = Integer.parseInt(firstPolynomial[i]) + Integer.parseInt(secondPolynomial[i]);
            polynomSummed.add(numberToAdd);
        }

        System.out.println(polynomSummed.toString().replaceAll(",", "")
                .replaceAll("\\[", "").replaceAll("]", ""));
    }
}
