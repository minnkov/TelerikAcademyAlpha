package e_Misc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> binaryInput = Arrays.stream(scanner.nextLine().split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int powerOfTwo = 0;
        long result = 0;

        while (!binaryInput.isEmpty()) {
            int currentIndex = binaryInput.size() - 1;
            int binaryDigit = binaryInput.get(currentIndex);

            if (binaryDigit == 0) {
                binaryInput.remove(currentIndex);
            } else {
                int numberToAdd = (int) (binaryInput.get(currentIndex) * Math.pow(2, powerOfTwo));
                binaryInput.remove(currentIndex);
                result += numberToAdd;
            }
            powerOfTwo++;
        }

        System.out.println(result);
    }
}
