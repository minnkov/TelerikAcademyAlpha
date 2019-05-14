package b_conditionalStatements;

import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] digitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        switch (input) {
            case "0":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "1":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "2":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "3":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "4":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "5":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "6":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "7":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "8":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            case "9":
                System.out.println(digitWords[Integer.parseInt(input)]);
                break;
            default:
                System.out.println("not a digit");
                break;
        }
    }
}
