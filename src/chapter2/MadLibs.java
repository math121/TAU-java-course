package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        /*
        1. Ask user for season of the year
        2. Ask a whole number
        3. Ask for an adjective
        4. Output: On a ____ ____ day, I drink a minimum of ____ cups of coffee
         */
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();
        scanner.nextLine(); // reads up the rest of the line - "\n" character

        System.out.println("Enter an adjective");
        String adjective = scanner.nextLine();
        scanner.close();

        String result = "On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee";
        System.out.println(result);

    }
}
