package e_Misc;

import java.util.Arrays;
import java.util.Scanner;

public class Kitty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("");
        int[] movement = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int souls = 0;
        int food = 0;
        int deadlocks = 0;
        int jumpsCounter = 0;

        String initialItem = items[0];

        int currentPosition = 0;

        goshko:
        for (int i = 0; i < movement.length; i++) {

            switch (initialItem) {
                case "@":
                    souls++;
                    i = -1;
                    initialItem = "empty";
                    continue goshko;
                case "*":
                    food++;
                    i = -1;
                    initialItem = "empty";
                    continue goshko;
                case "x":
                    System.out.println("You are deadlocked, you greedy kitty!");
                    System.out.println("Jumps before deadlock: " + jumpsCounter);
                    break goshko;
            }

            items[0] = "empty";

            int positionsToMoveBy = movement[i];
            int newPosition = currentPosition + positionsToMoveBy;

            if (newPosition < 0) {
                newPosition = Math.abs(newPosition);
                newPosition = items.length - ((newPosition + items.length) % (items.length));
            } else if (newPosition >= items.length) {
                newPosition = newPosition % (items.length);
            }

            String currentItem = items[newPosition];
            jumpsCounter++;

            if (currentItem.equals("@")) {
                souls++;
            } else if (currentItem.equals("*")){
                food++;
            } else if (currentItem.equals("x")) {

                if (newPosition % 2 == 0) {
                    if (souls >= 1) {
                        souls--;
                        deadlocks++;
                    } else {
                        System.out.println("You are deadlocked, you greedy kitty!");
                        System.out.println("Jumps before deadlock: " + jumpsCounter);
                        break goshko;
                    }
                } else {
                    if (food >= 1) {
                        food--;
                        deadlocks++;
                    } else {
                        System.out.println("You are deadlocked, you greedy kitty!");
                        System.out.println("Jumps before deadlock: " + jumpsCounter);
                        break goshko;
                    }
                }

            }
            items[newPosition] = "empty";
            currentPosition = newPosition;
        }
        if (jumpsCounter == movement.length) {
            System.out.println("Coder souls collected: " + souls);
            System.out.println("Food collected: " + food);
            System.out.println("Deadlocks: " + deadlocks);

        }
    }
}
