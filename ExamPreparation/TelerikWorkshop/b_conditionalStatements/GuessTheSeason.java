package b_conditionalStatements;

import java.util.Scanner;

public class GuessTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int date = Integer.parseInt(scanner.nextLine());

        if ((month.equals("March") && date >= 20) || month.equals("April") || month.equals("May")
                || (month.equals("June") && date < 21)) {
            System.out.println("Spring");
        } else if ((month.equals("June") && date >= 21) || month.equals("July")
                || month.equals("August") || (month.equals("September") && date < 22))  {
            System.out.println("Summer");
        } else if ((month.equals("September") && date >= 22) || month.equals("October")
                || month.equals("November") || (month.equals("December") && date < 21))  {
            System.out.println("Autumn");
        } else if ((month.equals("December") && date >= 21) || month.equals("January")
                || month.equals("February") || (month.equals("March") && date < 20))  {
            System.out.println("Winter");
        }
    }
}
