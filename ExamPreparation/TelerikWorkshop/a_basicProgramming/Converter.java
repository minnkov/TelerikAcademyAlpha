package a_basicProgramming;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int milesPerGalon = Integer.parseInt(scanner.nextLine());

        double galonsPerMile = 1.0 / milesPerGalon;
        double litersPerMile = galonsPerMile * 4.54;
        double litersPerKilometer = litersPerMile / 1.6;

        double litersPer100Km = Math.floor(litersPerKilometer * 100);

        System.out.printf("%.0f litres per 100 km", litersPer100Km);
    }
}
