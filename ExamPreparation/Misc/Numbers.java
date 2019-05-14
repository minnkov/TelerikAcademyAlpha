package e_Misc;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> number = new ArrayList<>();

        ivan:
        while (true) {

            String[] input = scanner.nextLine().split("[ -]");

            switch (input[0]) {
                case "set":
                    List<String> numberToAdd = Arrays.stream(input[1].split(""))
                            .collect(Collectors.toList());
                    if (!number.isEmpty()) {
                        number.clear();
                    }
                    number.addAll(numberToAdd);
                    break;
                case "front":
                    if (input[1].equals("add")) {
                        number.add(0, input[2]);
                    } else if (input[1].equals("remove")) {
                        if (!number.isEmpty()) {
                            number.remove(0);
                        }
                    }
                    break;
                case "back":
                    if (input[1].equals("add")) {
                        number.add(input[2]);
                    } else if (input[1].equals("remove")) {
                        if (!number.isEmpty()) {
                            number.remove(number.size() - 1);
                        }
                    }
                    break;
                case "reverse":
                    if (!number.isEmpty()) {
                        for (int i = 0; i < number.size() / 2; i++) {
                            String temp = number.get(i);
                            number.set(i, number.get(number.size() - 1 - i));
                            number.set(number.size() - 1 - i, temp);
                        }
                    }
                    break;
                case "print":
                    if (number.isEmpty()) {
                        System.out.println();
                    } else {
                        System.out.println(number.toString().replaceAll("[, \\[\\]]", ""));
                    }
                    break;
                case "end":
                    break ivan;
            }
        }
    }
}
