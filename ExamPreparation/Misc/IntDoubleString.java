package e_Misc;

import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine().toLowerCase();

        switch (dataType) {
            case "integer":
                int value = Integer.parseInt(scanner.nextLine());
                value += 1;
                System.out.println(value);
                break;
            case "real":
                double valueDouble = Double.parseDouble(scanner.nextLine());
                valueDouble += 1.0;
                System.out.printf("%.2f\n", valueDouble);
                break;
            case "text":
                String valueText = scanner.nextLine();
                valueText += "*";
                System.out.println(valueText);
                break;
        }
    }
}
