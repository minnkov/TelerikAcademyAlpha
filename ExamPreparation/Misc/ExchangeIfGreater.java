package e_Misc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.###########");

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.println(df.format(a) + " " + df.format(b));
    }
}
