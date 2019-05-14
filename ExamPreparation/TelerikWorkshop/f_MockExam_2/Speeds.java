package g_MockExam_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int longestGroupSize = 0;
        int initialSpeedsSumOfLongestGroup = 0;
        int previousCarSpeed = 0;
        int currentGroupSize = 0;
        int currentGroupSpeed = 0;

        for (int i = 0; i < n; i++) {

            int carSpeed = Integer.parseInt(scanner.nextLine());

            if (i == 0) {
                previousCarSpeed = carSpeed;
                currentGroupSpeed = carSpeed;
                currentGroupSize = 1;
                continue;
            } else {
                if (carSpeed > previousCarSpeed){
                    currentGroupSize ++;
                    currentGroupSpeed += carSpeed;
                    if (currentGroupSize > longestGroupSize) {
                        longestGroupSize = currentGroupSize;
                        initialSpeedsSumOfLongestGroup = currentGroupSpeed;
                    } else if (currentGroupSize == longestGroupSize) {
                        if (currentGroupSpeed > initialSpeedsSumOfLongestGroup) {
                            initialSpeedsSumOfLongestGroup = currentGroupSpeed;
                        }
                    }
                } else {

                    if (i != 1) {
                        previousCarSpeed = carSpeed;
                        currentGroupSize = 1;
                        currentGroupSpeed = carSpeed;
                    }
                    if (currentGroupSize > longestGroupSize) {
                        longestGroupSize = currentGroupSize;
                        initialSpeedsSumOfLongestGroup = currentGroupSpeed;
                    } else if (currentGroupSize == longestGroupSize) {
                        if (currentGroupSpeed > initialSpeedsSumOfLongestGroup) {
                            initialSpeedsSumOfLongestGroup = currentGroupSpeed;
                        }
                    }
                }
            }
        }
        System.out.println(initialSpeedsSumOfLongestGroup);
    }
}
