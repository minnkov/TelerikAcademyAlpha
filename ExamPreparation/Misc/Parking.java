package e_Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nAndM = scanner.nextLine().split(" ");

        int linesCount = Integer.parseInt(nAndM[0]);
        int columnsCount = Integer.parseInt(nAndM[1]);

        //get all parking spaces and parked cars in linear structure
        List<String> parkingSpaces = new ArrayList<>();

        String firstLine = scanner.nextLine();

        for (int i = 0; i < linesCount - 1; i++) {

            //get all valid parking spaces between each two lines
            String secondLine = scanner.nextLine();

            String parkingSpace = "";

            for (int j = 0; j < firstLine.length() - 1; j++) {

                if (firstLine.charAt(j) != '#' && secondLine.charAt(j) != '#') {

                    if (firstLine.charAt(j + 1) != '#' && secondLine.charAt(j + 1) != '#') {

                        parkingSpace += firstLine.charAt(j);
                        parkingSpace += secondLine.charAt(j);
                        parkingSpace += firstLine.charAt(j + 1);
                        parkingSpace += secondLine.charAt(j + 1);

                        parkingSpaces.add(parkingSpace);

                        parkingSpace = "";
                    }
                }
            }

            firstLine = secondLine;
        }

        int zeroParkedCars = 0;
        int oneParkedCar = 0;
        int twoParkedCars = 0;
        int threeParkedCars = 0;
        int fourParkedCars = 0;

        for (int i = 0; i < parkingSpaces.size(); i++) {

            int parkedCars = 0;

            String parkingSpace = parkingSpaces.get(i);

            for (int j = 0; j < parkingSpace.length(); j++) {

                if (parkingSpace.charAt(j) == 'X') {

                    parkedCars++;
                }
            }

            if (parkedCars == 0) {
                zeroParkedCars++;
            } else if (parkedCars == 1) {
                oneParkedCar++;
            } else if (parkedCars == 2) {
                twoParkedCars ++;
            } else if (parkedCars == 3) {
                threeParkedCars ++;
            } else {
                fourParkedCars++;
            }
        }

        System.out.println(zeroParkedCars);
        System.out.println(oneParkedCar);
        System.out.println(twoParkedCars);
        System.out.println(threeParkedCars);
        System.out.println(fourParkedCars);
    }
}
