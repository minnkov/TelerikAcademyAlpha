package e_Misc;

import java.util.Scanner;

public class BusTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wAndH = scanner.nextLine().split(" ");

        int busWidth = Integer.parseInt(wAndH[0].trim());
        int busHeight = Integer.parseInt(wAndH[1].trim());

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 1; i <= n; i++) {

            String[] obstacleInfo = scanner.nextLine().split(" ");

            int obstaclePassMaxWidth = Integer.parseInt(obstacleInfo[0].trim());
            int obstaclePassMaxHeight = Integer.parseInt(obstacleInfo[1].trim());

            if (busWidth > obstaclePassMaxWidth || busHeight > obstaclePassMaxHeight) {

                System.out.println(i);
                return;
            }
        }

        System.out.println("No crash");
    }
}
