package e_Misc;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(" ");

        int firstNum = Integer.parseInt(reverseNum(nums[0]));
        int secondNum = Integer.parseInt(reverseNum(nums[1]));

        int pin = Math.max(firstNum, secondNum);

        System.out.println(pin);
    }

    private static String reverseNum(String reversedNum) {

        String num = "";

        for (int i = reversedNum.length() - 1; i >= 0; i--) {

            num += reversedNum.charAt(i);
        }

        return num;
    }
}
