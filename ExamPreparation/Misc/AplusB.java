package e_Misc;

import java.math.BigInteger;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            BigInteger firstNum = new BigInteger(input[0]);
            BigInteger secondNum = new BigInteger(input[1]);

            BigInteger sum = firstNum.add(secondNum);

            System.out.println(sum);
        }
    }
}
