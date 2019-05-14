package b_conditionalStatements;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputYear = Integer.parseInt(scanner.nextLine());
        int differenceFrom2000 = inputYear - 2000;
        int removedReoccurences = 0;

        if (inputYear >= 2000){
            differenceFrom2000 = Math.abs(differenceFrom2000);
            removedReoccurences = differenceFrom2000 % 12;
        } else if (inputYear < 2000) {
            differenceFrom2000 = Math.abs(differenceFrom2000);
            removedReoccurences = differenceFrom2000 % 12;
            switch (removedReoccurences) {
                case 1:
                    removedReoccurences = 11;
                    break;
                case 2:
                    removedReoccurences = 10;
                    break;
                case 3:
                    removedReoccurences = 9;
                    break;
                case 4:
                    removedReoccurences = 8;
                    break;
                case 5:
                    removedReoccurences = 7;
                    break;
                case 6:
                    removedReoccurences = 6;
                    break;
                case 7:
                    removedReoccurences = 5;
                    break;
                case 8:
                    removedReoccurences = 4;
                    break;
                case 9:
                    removedReoccurences = 3;
                    break;
                case 10:
                    removedReoccurences = 2;
                    break;
                case 11:
                    removedReoccurences = 1;
                    break;
            }
        }

        switch (removedReoccurences) {
            case 0:
                System.out.println("Dragon");
                break;
            case 1:
                System.out.println("Snake");
                break;
            case 2:
                System.out.println("Horse");
                break;
            case 3:
                System.out.println("Sheep");
                break;
            case 4:
                System.out.println("Monkey");
                break;
            case 5:
                System.out.println("Rooster");
                break;
            case 6:
                System.out.println("Dog");
                break;
            case 7:
                System.out.println("Pig");
                break;
            case 8:
                System.out.println("Rat");
                break;
            case 9:
                System.out.println("Ox");
                break;
            case 10:
                System.out.println("Tiger");
                break;
            case 11:
                System.out.println("Hare");
                break;
        }
    }
}
