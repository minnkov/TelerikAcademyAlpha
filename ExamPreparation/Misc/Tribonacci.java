package e_Misc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BigInteger> tribonacciSequence = new ArrayList<>();

        BigInteger firstNum = BigInteger.valueOf(Integer.parseInt(scanner.nextLine()));
        BigInteger secondNum = BigInteger.valueOf(Integer.parseInt(scanner.nextLine()));
        BigInteger thirdNum = BigInteger.valueOf(Integer.parseInt(scanner.nextLine()));
        int n = Integer.parseInt(scanner.nextLine());

        tribonacciSequence.add(firstNum); tribonacciSequence.add(secondNum); tribonacciSequence.add(thirdNum);

        while (tribonacciSequence.size() < n) {

            BigInteger newNum = firstNum.add(secondNum.add(thirdNum));
            tribonacciSequence.add(newNum);

            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = newNum;
        }

        System.out.println(tribonacciSequence.get(n - 1));
    }
}
