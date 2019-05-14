package d_Arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int[] inputNumeric = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            inputNumeric[i] = Integer.parseInt(input[i]);
        }

        int n = inputNumeric.length;
        int missingNumberCounter = 0;
        String output = "";

        for (int i = 1; i <= n; i++) {
            boolean isInList = false;

            for (int j = 0; j < inputNumeric.length; j++) {
                if (i == inputNumeric[j]) {
                    isInList = true;
                }
            }
            if (!isInList) {
                if (!"".equals(output)){
                    output += "," + i;
                } else {
                    output += i;
                }
            }
        }
        System.out.println(output);
    }
}
