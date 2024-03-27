package chapter5;

import java.util.Locale;
import java.util.Scanner;

public class PhoneBillCalculator {

    public static double calculateTax(double planFee, double overageFees) {
        double tax = 0.15;
        return (planFee + overageFees) * 0.15;
    }

    public static double calculateOverageFees(int minutes) {
        double chargePerMinute = 0.25;
        return chargePerMinute * minutes;
    }

    public static void calculateAndPrintBill(double planFee, double overageFees, double tax) {
        double total = planFee + overageFees + tax;

        System.out.println("Phone Bill Statement\n" +
                "Plan: $" + String.format(Locale.ENGLISH,"%.2f", planFee) + "\n" +
                "Overage: $" + String.format(Locale.ENGLISH,"%.2f", overageFees) + "\n" +
                "Tax: $" + String.format(Locale.ENGLISH,"%.2f", tax) + "\n" +
                "Total: $" + String.format(Locale.ENGLISH,"%.2f", total));
    }

    public static void main(String[] args) {
        System.out.println("Enter base cost of the plan:");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int minutes = scanner.nextInt();
        scanner.close();

        double overageFees = calculateOverageFees(minutes);
        double tax = calculateTax(planFee, overageFees);

        calculateAndPrintBill(planFee, overageFees, tax);

    }
}
