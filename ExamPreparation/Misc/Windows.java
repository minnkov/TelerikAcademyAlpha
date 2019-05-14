package e_Misc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Windows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nAndC = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nAndC[0]);
        int priceSquareCantimeter = Integer.parseInt(nAndC[1]);

        double brokenWindowsTotalSize = 0;

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            if (input[2].equals("0")) {
                continue;
            }

            double width = Double.parseDouble(input[0]);
            double height = Double.parseDouble(input[1]);

            double brokenWindowSize = width * height;
            brokenWindowsTotalSize += brokenWindowSize;

        }

        double totalPrice = brokenWindowsTotalSize * priceSquareCantimeter;

        DecimalFormat df = new DecimalFormat("0.###########");

        System.out.println(df.format(totalPrice));
    }
}
