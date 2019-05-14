package e_Misc;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int p = 0;

        if (n == 1) {
            System.out.println(0);
            return;

        } else {

            i = 2;
            p = 0;

            while (i <= Math.sqrt(n)) {
                if (n%i==0)
                {
                    p=i;
                    break;
                }
                else {
                    i++;
                }
            }
            if (i>Math.sqrt(n)) {
                System.out.println(n - 1);
            } else {
                System.out.println(n - n / p);
            }
        }
    }
}
