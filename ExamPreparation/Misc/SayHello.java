package e_Misc;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        printHelloName(name);
    }

    public static void printHelloName(String name) {
        System.out.printf("Hello, %s!\n", name);
    }
}
