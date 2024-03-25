package chapter3;

import java.util.Scanner;

public class ChangeforADollar {
    public static void main(String[] args) {
        int centsPerdollar = 100;
        int centsPerNickel = 5;
        int centsPerDime = 10;
        int centsPerQuarter = 25;


        //Ask user how many pennies, nickels, dimes and quarters
        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarters = scanner.nextInt();
        scanner.close();

        int totalCents = pennies + (nickels * centsPerNickel) + (dimes * centsPerDime) + (quarters * centsPerQuarter);
        double totalDollars = (double) totalCents/centsPerdollar;

        if (totalCents == centsPerdollar) {
            System.out.println("It is exactly $" + totalDollars + ". You win!");
        } else if (totalCents > centsPerdollar) {
            System.out.println("It is more than $1: $" + totalDollars + ". You went over by " +
                    (totalCents - centsPerdollar) + " cents.");
        } else {
            System.out.println("It is less than $1: $" + totalDollars + ". You went under by " +
                    (centsPerdollar - totalCents) + " cents.");
        }
    }
}
