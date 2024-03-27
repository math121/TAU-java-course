package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private final static String[] DAYS_OF_THE_WEEK = {"Monday", "Tuesday", "Wednesday",
                                                      "Thursday", "Friday", "Saturday", "Sunday"};

    public static String findDay(int number) {
        if (number >= 1 && number <= 7) {
            return DAYS_OF_THE_WEEK[number - 1];
        } else {
            return "Invalid number";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number corresponding to the day of the week:");
        int number = scanner.nextInt();
        System.out.println(findDay(number));

    }
}
