package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingAndSquashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> inputNums = new ArrayList<>();

        List<String> mergedNums = new ArrayList<>();
        List<String> squashedNums = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            inputNums.add(input);

            if (inputNums.size() >= 2) {

                String firstNum = inputNums.get(i - 1);
                String secondNum = inputNums.get(i);

                String mergedNum = "";
                mergedNum += firstNum.charAt(1);
                mergedNum += secondNum.charAt(0);
                mergedNums.add(mergedNum);

                String squashedNum = "";
                squashedNum += firstNum.charAt(0);
                int sumOfMiddleDigits = Character.getNumericValue(firstNum.charAt(1)) + Character.getNumericValue(secondNum.charAt(0));
                if (sumOfMiddleDigits >= 10) {
                    sumOfMiddleDigits -= 10;
                }
                squashedNum += sumOfMiddleDigits;
                squashedNum += secondNum.charAt(1);
                squashedNums.add(squashedNum);
            }
        }

        System.out.println(mergedNums.toString().replaceAll("[,\\[\\]]", ""));
        System.out.println(squashedNums.toString().replaceAll("[,\\[\\]]", ""));
    }
}
