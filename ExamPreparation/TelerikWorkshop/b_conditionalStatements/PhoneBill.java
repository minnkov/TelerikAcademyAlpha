package b_conditionalStatements;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int textMessagesTotal = Integer.parseInt(scanner.nextLine());
        int minutesTotal = Integer.parseInt(scanner.nextLine());
        int additionalMessages = 0;
        int additionalMinutes = 0;
        double additionalMessagesBill = 0;
        double additionalMinutesBill = 0;
        double totalBill = 12;
        double additionalTaxes = 0;

        if (textMessagesTotal > 20) {
            additionalMessages = textMessagesTotal - 20;
            additionalMessagesBill = additionalMessages * 0.06;
            additionalTaxes += (additionalMessagesBill * 0.2);
        }
        if (minutesTotal > 60) {
            additionalMinutes = minutesTotal - 60;
            additionalMinutesBill = additionalMinutes * 0.1;
            additionalTaxes += (additionalMinutesBill * 0.2);
        }

        totalBill += additionalMessagesBill + additionalMinutesBill + additionalTaxes;

        System.out.printf("%d additional messages for %.2f levas%n", additionalMessages, additionalMessagesBill);
        System.out.printf("%d additional minutes for %.2f levas%n", additionalMinutes, additionalMinutesBill);
        System.out.printf("%.2f additional taxes%n", additionalTaxes);
        System.out.printf("%.2f total bill%n", totalBill);
    }
}
