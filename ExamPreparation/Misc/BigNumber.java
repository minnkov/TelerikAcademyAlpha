package e_Misc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String number = scanner.nextLine().replaceAll(" ", "");

        String[] digits = number.split("");

        List<Integer> digitsCollector = new ArrayList<>();

        BigInteger biggestPalindrome = BigInteger.ZERO;

        //cases:

        //1. two equal central digits

        for (int i = 0; i < digits.length - 1; i++) {

            int leftDigit = 0;
            int rightDigit = 0;

            try {
                leftDigit = Integer.parseInt(digits[i]);
                rightDigit = Integer.parseInt(digits[i + 1]);
            } catch (Exception e) {
                continue;
            }


            if (leftDigit == rightDigit) {

                digitsCollector.add(leftDigit);
                digitsCollector.add(rightDigit);

                int leftIndexer = i - 1;
                int rightIndexer = i + 2;

                while (leftIndexer >= 0 && rightIndexer <= digits.length - 1) {

                    try {
                        leftDigit = Integer.parseInt(digits[leftIndexer]);
                        rightDigit = Integer.parseInt(digits[rightIndexer]);
                    } catch (Exception e) {
                        break;
                    }


                    if (leftDigit == rightDigit) {
                        digitsCollector.add(0, leftDigit);
                        digitsCollector.add(rightDigit);
                    } else {
                        break;
                    }

                    leftIndexer--;
                    rightIndexer++;
                }

                while (digitsCollector.size() >= 2 && digitsCollector.get(0) == 0) {

                    digitsCollector.remove(digitsCollector.size() - 1);
                    digitsCollector.remove(0);
                }

                if (!digitsCollector.isEmpty()) {
                    String value = digitsCollector.toString().replaceAll("[, \\[\\]]", "");
                    BigInteger temp = new BigInteger(value);
                    biggestPalindrome = biggestPalindrome.max(temp);

                    digitsCollector.clear();
                }

            } else {
                biggestPalindrome = biggestPalindrome.max(BigInteger.valueOf(leftDigit));
                biggestPalindrome = biggestPalindrome.max(BigInteger.valueOf(rightDigit));
            }
        }

        //2. one central digit
        for (int i = 1; i < digits.length - 1; i++) {

            int leftDigit = 0;
            int centralDigit = 0;
            int rightDigit = 0;

            try {
                leftDigit = Integer.parseInt(digits[i - 1]);
                centralDigit = Integer.parseInt(digits[i]);
                rightDigit = Integer.parseInt(digits[i + 1]);
            } catch (Exception e) {
                continue;
            }


            if (leftDigit == rightDigit) {

                digitsCollector.add(leftDigit);
                digitsCollector.add(centralDigit);
                digitsCollector.add(rightDigit);

                int leftIndexer = i - 2;
                int rightIndexer = i + 2;

                while (leftIndexer >= 0 && rightIndexer <= digits.length - 1) {

                    try {
                        leftDigit = Integer.parseInt(digits[leftIndexer]);
                        rightDigit = Integer.parseInt(digits[rightIndexer]);
                    } catch (Exception e) {
                        break;
                    }



                    if (leftDigit == rightDigit) {
                        digitsCollector.add(0, leftDigit);
                        digitsCollector.add(rightDigit);
                    } else {
                        break;
                    }

                    leftIndexer--;
                    rightIndexer++;
                }

                while (digitsCollector.size() >= 2 && digitsCollector.get(0) == 0) {

                    digitsCollector.remove(digitsCollector.size() - 1);
                    digitsCollector.remove(0);
                }

                if (!digitsCollector.isEmpty()) {
                    String value = digitsCollector.toString().replaceAll("[, \\[\\]]", "");
                    BigInteger temp = new BigInteger(value);
                    biggestPalindrome = biggestPalindrome.max(temp);

                    digitsCollector.clear();
                }

            } else {
                biggestPalindrome = biggestPalindrome.max(BigInteger.valueOf(centralDigit));
            }
        }

        System.out.println(biggestPalindrome);
    }
}
