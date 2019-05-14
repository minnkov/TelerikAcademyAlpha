package e_Misc;

import java.math.BigDecimal;
import java.util.Scanner;

public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal x = new BigDecimal(scanner.nextLine());
        BigDecimal y = new BigDecimal(scanner.nextLine());

        boolean xIsPositive = true;
        boolean xIsZero = false;

        boolean yIsPositive = true;
        boolean yIsZero = false;

        if (x.compareTo(BigDecimal.ZERO) < 0) {
            xIsPositive = false;
        } else if (x.compareTo(BigDecimal.ZERO) == 0) {
            xIsZero = true;
        }
        if (y.compareTo(BigDecimal.ZERO) < 0) {
            yIsPositive = false;
        } else if (y.compareTo(BigDecimal.ZERO) == 0) {
            yIsZero = true;
        }

        if (xIsZero) {
            if (yIsZero) {
                System.out.println(0);
            } else {
                System.out.println(5);
            }
        } else if (yIsZero) {
            if (xIsZero) {
                System.out.println(0);
            } else {
                System.out.println(6);
            }
        } else if (xIsPositive) {
            if (yIsPositive) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else if (!xIsPositive) {
            if (yIsPositive) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        } else if (yIsPositive) {
            if (xIsPositive) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else if (!yIsPositive) {
            if (xIsPositive) {
                System.out.println(4);
            } else {
                System.out.println(3);
            }
        }
    }
}
