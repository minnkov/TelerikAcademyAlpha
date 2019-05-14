package b_conditionalStatements;

import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double payAmount = Double.parseDouble(scanner.nextLine());
        int changeInSt = (int)((payAmount - price) * 100);

        int coinsOfOneLev = changeInSt / 100;
        changeInSt -= coinsOfOneLev * 100;
        int coinsOfFiftySt = changeInSt / 50;
        changeInSt -= coinsOfFiftySt * 50;
        int coinsOfTwentySt = changeInSt / 20;
        changeInSt -= coinsOfTwentySt * 20;
        int coinsOfTenSt = changeInSt / 10;
        changeInSt -= coinsOfTenSt * 10;
        int coinsOfFiveSt = changeInSt / 5;
        changeInSt -= coinsOfFiveSt * 5;
        int coinsOfTwoSt = changeInSt / 2;
        changeInSt -= coinsOfTwoSt * 2;
        int coinsOfOneSt = changeInSt / 1;
        changeInSt -= coinsOfOneSt;

        if (coinsOfOneLev > 0) {
            System.out.println(coinsOfOneLev + " x 1 lev");
        }
        if (coinsOfFiftySt > 0) {
            System.out.println(coinsOfFiftySt + " x 50 stotinki");
        }
        if (coinsOfTwentySt > 0) {
            System.out.println(coinsOfTwentySt + " x 20 stotinki");
        }
        if (coinsOfTenSt > 0) {
            System.out.println(coinsOfTenSt + " x 10 stotinki");
        }
        if (coinsOfFiveSt > 0) {
            System.out.println(coinsOfFiveSt + " x 5 stotinki");
        }
        if (coinsOfTwoSt > 0) {
            System.out.println(coinsOfTwoSt + " x 2 stotinki");
        }
        if (coinsOfOneSt > 0) {
            System.out.println(coinsOfOneSt + " x 1 stotinka");
        }
    }
}
