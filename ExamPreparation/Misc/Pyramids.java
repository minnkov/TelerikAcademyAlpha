package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class Pyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger number = new BigInteger(scanner.nextLine());



        int columnCounter = 0;
        int sth = 1;

        while (true) {

            number = number.subtract(BigInteger.valueOf(sth * sth));
            columnCounter++;
            sth++;

            if (number.compareTo(BigInteger.ZERO) <= 0) {
                System.out.println(columnCounter);
                break;
            }
        }

    }
}
