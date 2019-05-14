package e_Misc;

import java.util.Scanner;

public class Beach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elephantsInfo = scanner.nextLine().split(" ");

        int firstElephantArrivalHour = Integer.parseInt(elephantsInfo[0]);
        int firstElephantArrivalMinutes = Integer.parseInt(elephantsInfo[1]);
        int firstElephantLeaveHour = Integer.parseInt(elephantsInfo[2]);
        int firstElephantLeaveMinutes = Integer.parseInt(elephantsInfo[3]);

        int secondElephantArrivalHour = Integer.parseInt(elephantsInfo[4]);
        int secondElephantArrivalMinutes = Integer.parseInt(elephantsInfo[5]);
        int secondElephantLeaveHour = Integer.parseInt(elephantsInfo[6]);
        int secondElephantLeaveMinutes = Integer.parseInt(elephantsInfo[7]);

        int meetingStartHour = -1;
        int meetingStartMinutes = 0;

        int meetingEndHour = 0;
        int meetingEndMinutes = 0;

        boolean firstElephantArrivedFirst = false;

        if (firstElephantArrivalHour < secondElephantArrivalHour) {
            firstElephantArrivedFirst = true;
        } else if (firstElephantArrivalHour == secondElephantArrivalHour) {
            if (firstElephantArrivalMinutes < secondElephantArrivalMinutes) {
                firstElephantArrivedFirst = true;
            } else if (firstElephantArrivalMinutes == secondElephantArrivalMinutes) {
                meetingStartHour = firstElephantArrivalHour;
                meetingStartMinutes = firstElephantArrivalMinutes;
            }
        }

        if (firstElephantArrivedFirst) {

            if (secondElephantArrivalHour < firstElephantLeaveHour) {
                meetingStartHour = secondElephantArrivalHour;
                meetingStartMinutes = secondElephantArrivalMinutes;

                if (secondElephantLeaveHour < firstElephantLeaveHour) {
                    meetingEndHour = secondElephantLeaveHour;
                    meetingEndMinutes = secondElephantLeaveMinutes;
                } else if (firstElephantLeaveHour < secondElephantLeaveHour) {
                    meetingEndHour = firstElephantLeaveHour;
                    meetingEndMinutes = firstElephantLeaveMinutes;
                } else if (firstElephantLeaveHour == secondElephantLeaveHour) {
                    meetingEndHour = firstElephantLeaveHour;
                    meetingEndMinutes = Math.min(firstElephantLeaveMinutes, secondElephantLeaveMinutes);
                }
            } else if (secondElephantArrivalHour == firstElephantLeaveHour) {

                if (secondElephantArrivalMinutes < firstElephantLeaveMinutes) {
                    meetingStartHour = secondElephantArrivalHour;
                    meetingStartMinutes = Math.min(secondElephantArrivalMinutes, firstElephantLeaveMinutes);
                    meetingEndHour = secondElephantArrivalHour;
                    meetingEndMinutes = Math.max(secondElephantArrivalMinutes, firstElephantLeaveMinutes);
                } else if (secondElephantArrivalMinutes == firstElephantArrivalMinutes) {
                    meetingStartHour = secondElephantArrivalHour;
                    meetingStartMinutes = secondElephantArrivalMinutes;
                    meetingEndHour = secondElephantArrivalHour;
                    meetingEndMinutes = secondElephantArrivalMinutes;
                }
            }
        } else {

            if (firstElephantArrivalHour < secondElephantLeaveHour) {
                meetingStartHour = firstElephantArrivalHour;
                meetingStartMinutes = firstElephantArrivalMinutes;

                if (secondElephantLeaveHour < firstElephantLeaveHour) {
                    meetingEndHour = secondElephantLeaveHour;
                    meetingEndMinutes = secondElephantLeaveMinutes;
                } else if (firstElephantLeaveHour < secondElephantLeaveHour) {
                    meetingEndHour = firstElephantLeaveHour;
                    meetingEndMinutes = firstElephantLeaveMinutes;
                } else if (firstElephantLeaveHour == secondElephantLeaveHour) {
                    meetingEndHour = firstElephantLeaveHour;
                    meetingEndMinutes = Math.min(firstElephantLeaveMinutes, secondElephantLeaveMinutes);
                }
            } else if (firstElephantArrivalHour == secondElephantLeaveHour) {

                if (firstElephantArrivalMinutes < secondElephantLeaveMinutes) {
                    meetingStartHour = secondElephantArrivalHour;
                    meetingStartMinutes = Math.min(secondElephantLeaveMinutes, firstElephantArrivalMinutes);
                    meetingEndHour = secondElephantArrivalHour;
                    meetingEndMinutes = Math.max(secondElephantLeaveMinutes, firstElephantArrivalMinutes);
                } else if (secondElephantLeaveMinutes == firstElephantArrivalMinutes) {
                    meetingStartHour = secondElephantLeaveHour;
                    meetingStartMinutes = secondElephantLeaveMinutes;
                    meetingEndHour = secondElephantLeaveHour;
                    meetingEndMinutes = secondElephantLeaveMinutes;
                }
            }
        }

        if (meetingStartHour != -1 ) {

            System.out.print(meetingStartHour + " ");

            if (meetingStartMinutes <= 9 && meetingStartMinutes != 0) {
                System.out.print("0" + meetingStartMinutes + " ");
            } else {
                System.out.print(meetingStartMinutes + " ");
            }

            System.out.print(meetingEndHour + " ");

            if (meetingEndMinutes <= 9 && meetingEndMinutes != 0) {
                System.out.print("0" + meetingEndMinutes + " ");
            } else {
                System.out.print(meetingEndMinutes + " ");
            }

            System.out.println();
        } else {
            System.out.println("No");
        }
    }
}
