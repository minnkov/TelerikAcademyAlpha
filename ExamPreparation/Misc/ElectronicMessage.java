package e_Misc;

import java.util.Scanner;

public class ElectronicMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] messageSymbols = scanner.nextLine().toCharArray();

        int longestBrokenSymbolSequence = 0;

        for (int i = 0; i < messageSymbols.length - 1; i++) {

            int currentBrokenSymbolsSequence = 0;

            char currentSymbol = messageSymbols[i];

            if (currentSymbol == 32 || (currentSymbol >= 48 && currentSymbol <= 57) || (currentSymbol >= 65
                    && currentSymbol <= 90) || (currentSymbol >= 97 && currentSymbol <= 122) ) {
                continue;
            } else {

                currentBrokenSymbolsSequence++;

                for (int j = i + 1; j < messageSymbols.length - 1; j++) {

                    char tempSymbol = messageSymbols[j];

                    if (tempSymbol == 32 || (tempSymbol >= 48 && tempSymbol <= 57) || (tempSymbol >= 65
                            && tempSymbol <= 90) || (tempSymbol >= 97 && tempSymbol <= 122) ) {

                        if (currentBrokenSymbolsSequence > longestBrokenSymbolSequence) {
                            longestBrokenSymbolSequence = currentBrokenSymbolsSequence;
                        }

                        currentBrokenSymbolsSequence = 0;
                        i = j - 1;
                        break;
                    } else {
                        currentBrokenSymbolsSequence++;
                    }
                }

                if (currentBrokenSymbolsSequence > longestBrokenSymbolSequence) {
                    longestBrokenSymbolSequence = currentBrokenSymbolsSequence;
                }
            }
        }

        System.out.println(longestBrokenSymbolSequence);
    }
}
