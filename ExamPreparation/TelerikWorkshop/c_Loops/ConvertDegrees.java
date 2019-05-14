package c_Loops;

import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] celsiusTemps = scanner.nextLine().split(" ");

        for (String celsiusTemp : celsiusTemps) {
            double farenheitTemp = ((Double.parseDouble(celsiusTemp) * 9) / 5) + 32;
            System.out.println(Math.round(farenheitTemp));
        }
    }
}
