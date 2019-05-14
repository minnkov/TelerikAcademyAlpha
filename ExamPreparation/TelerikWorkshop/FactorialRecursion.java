import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
