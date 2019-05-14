package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class Hotels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int[] hotelsHeight = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rightToLeftVisibilityCounter = 1;
        int leftToRightVisibilityCounter = 1;

        int previousHighestHotelHeight = 0;

        for (int i = 1; i < hotelsHeight.length; i++) {

            int previousHotelHeight = hotelsHeight[i - 1];

            if (previousHotelHeight >= previousHighestHotelHeight) {
                previousHighestHotelHeight = previousHotelHeight;
            }

            int currentHotelHeight = hotelsHeight[i];

            if (currentHotelHeight > previousHighestHotelHeight) {
                leftToRightVisibilityCounter++;
            }
        }

        previousHighestHotelHeight = 0;

        for (int i = hotelsHeight.length - 2; i >= 0 ; i--) {

            int previousHotelHeight = hotelsHeight[i + 1];

            if (previousHotelHeight >= previousHighestHotelHeight) {
                previousHighestHotelHeight = previousHotelHeight;
            }

            int currentHotelHeight = hotelsHeight[i];

            if (currentHotelHeight > previousHighestHotelHeight) {
                rightToLeftVisibilityCounter++;
            }
        }
        System.out.print(leftToRightVisibilityCounter + " " + rightToLeftVisibilityCounter);
    }
}
