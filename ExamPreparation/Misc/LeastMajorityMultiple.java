package e_Misc;

import java.util.*;

public class LeastMajorityMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        int dividerCount = 0;

        for (int number = 4; number <= a * b * c; number++)
        {
            dividerCount = 0;

            if(number % a == 0)
            {
                dividerCount++;
            }

            if (number % b == 0)
            {
                dividerCount++;
            }

            if (number % c == 0)
            {
                dividerCount++;
            }

            if (number % d == 0)
            {
                dividerCount++;
            }

            if (number % e == 0)
            {
                dividerCount++;
            }

            if (dividerCount >= 3)
            {
                System.out.println((number));
                break;
            }
        }
    }
}
