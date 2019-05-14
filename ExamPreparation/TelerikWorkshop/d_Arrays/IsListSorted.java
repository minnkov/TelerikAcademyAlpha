package d_Arrays;

import java.util.Scanner;

public class IsListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputList= scanner.nextLine().split(",");
            int[] numericList = new int[inputList.length];
            boolean isSorted = true;
            for (int j = 0; j < inputList.length; j++) {
                numericList[j] = Integer.parseInt(inputList[j]);
            }
            for (int j = 0; j < numericList.length - 1; j++) {
                if (numericList[j + 1] < numericList[j]) {
                    isSorted = false;
                    System.out.println(isSorted);
                    break;
                }
            }
            if (isSorted){
                System.out.println(isSorted);
            }
        }
    }
}
