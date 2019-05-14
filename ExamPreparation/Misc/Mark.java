package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        double[] marks = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Arrays.sort(marks);

        double sum = 0;

        int counter = 0;

        for (int i = 1; i <= marks.length - 2 ; i++) {

            sum += marks[i];

            counter++;
        }

        long average = Math.round(sum / counter);

        System.out.println(average);
    }
}
