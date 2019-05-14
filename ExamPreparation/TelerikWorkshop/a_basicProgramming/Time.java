package a_basicProgramming;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        int totalSeconds = (((days * 24) * 60)) * 60 + (hours * 60) * 60 + minutes * 60 + seconds;

        System.out.println(totalSeconds);
    }
}
