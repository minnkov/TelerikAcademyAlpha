package e_Misc;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arraySizes = scanner.nextLine().split(" ");

        int firstArraySize = Integer.parseInt(arraySizes[0]);
        int secondArraySize = Integer.parseInt(arraySizes[1]);

        List<String> firstArrayList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        List<String> secondArrayList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        if (firstArraySize < secondArraySize) {

            while (firstArrayList.size() < secondArrayList.size()) {
                firstArrayList.add("0");
            }

            String firstNum = firstArrayList.toString().replaceAll("[, \\[\\]]", "");
            String secondNum = secondArrayList.toString().replaceAll("[, \\[\\]]", "");

            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);

            BigInteger sumAB = a.add(b);

            String output = String.valueOf(sumAB);

            List<String> sum = Arrays.stream(output.split(""))
                    .collect(Collectors.toList());

            System.out.println(sum.toString().replaceAll("[,\\[\\]]", ""));

        } else if (secondArraySize < firstArraySize) {

            while (firstArrayList.size() > secondArrayList.size()) {
                secondArrayList.add("0");
            }

            String firstNum = secondArrayList.toString().replaceAll("[, \\[\\]]", "");
            String secondNum = firstArrayList.toString().replaceAll("[, \\[\\]]", "");

            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);

            BigInteger sumAB = a.add(b);

            String output = String.valueOf(sumAB);

            List<String> sum = Arrays.stream(output.split(""))
                    .collect(Collectors.toList());

            System.out.println(sum.toString().replaceAll("[,\\[\\]]", ""));

        } else {

            String firstNum = firstArrayList.toString().replaceAll("[, \\[\\]]", "");
            String secondNum = secondArrayList.toString().replaceAll("[, \\[\\]]", "");

            BigInteger a = new BigInteger(firstNum);
            BigInteger b = new BigInteger(secondNum);

            BigInteger sumAB = a.add(b);

            String output = String.valueOf(sumAB);

            List<String> sum = Arrays.stream(output.split(""))
                    .collect(Collectors.toList());

            System.out.println(sum.toString().replaceAll("[,\\[\\]]", ""));
        }
    }
}
