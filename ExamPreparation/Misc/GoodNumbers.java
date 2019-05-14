package e_Misc;

import java.util.Scanner;

public class GoodNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int startNum = Integer.parseInt(input[0]);
        int endNum = Integer.parseInt(input[1]);

        int counter = 0;

        for (int i = startNum; i <= endNum; i++) {
            int currentNum = i;
            String currentNumberString = String.valueOf(i);
            boolean isGoodNum = true;

            for (int j = 0; j < currentNumberString.length(); j++) {

                if (Character.getNumericValue(currentNumberString.charAt(j)) == 0) {
                    continue;
                }
                if (currentNum % Character.getNumericValue(currentNumberString.charAt(j)) != 0) {
                    isGoodNum = false;
                    break;
                }
            }
            if (isGoodNum) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
