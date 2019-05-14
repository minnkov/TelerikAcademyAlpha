package d_Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputList = scanner.nextLine().split(",");

        for (int i = 0; i < inputList.length; i++) {
            if (inputList[i].equals("kolioTerorista")) {
                continue;
            }
            for (int j = i + 1; j < inputList.length; j++) {
                if (inputList[i].equals(inputList[j])) {
                    inputList[j] = "kolioTerorista";
                }
            }
        }

        int outputListLength = 0;

        for (String s : inputList) {
            if (s.equals("kolioTerorista")) {
                continue;
            } else {
                outputListLength++;
            }
        }

        String[] outputList = new String[outputListLength];
        int counter = 0;

        for (int i = 0; i < inputList.length; i++) {
            if (inputList[i].equals("kolioTerorista")) {
                continue;
            } else {
                outputList[counter] = inputList[i];
                counter++;
            }
        }
        System.out.println(String.join(",", outputList));
    }
}
