package d_Arrays;

import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] list = scanner.nextLine().split(",");
        int n = Integer.parseInt(scanner.nextLine());

        if (n > list.length) {
            n %= list.length;
        }

        for (int i = 0; i < n; i++) {
            String firstElement = list[0];
            for (int j = 0; j < list.length - 1; j++) {
                list[j] = list[j + 1];
            }
            list[list.length - 1] = firstElement;
        }

        System.out.println(String.join(",", list));
    }
}
