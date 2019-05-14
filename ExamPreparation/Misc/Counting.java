package e_Misc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal n = new BigDecimal(scanner.nextLine());

        for (int i = 0; i < 10 ; i++) {
            n = n.add(BigDecimal.ONE);
            System.out.println(n);
        }
    }
}
