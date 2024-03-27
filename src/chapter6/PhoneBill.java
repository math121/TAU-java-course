package chapter6;

import java.util.Locale;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        id = 5;
        baseCost = 85.75;
        allottedMinutes = 250;
        minutesUsed = 200;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 97.45;
        allottedMinutes = 500;
        minutesUsed = 560;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateTax() {
        double taxRate = 0.15;
        double overageFees = calculateOverageFees();
        return (baseCost + overageFees) * taxRate;
    }

    public double calculateOverageFees() {
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }
        double chargePerMinute = 0.25;
        return chargePerMinute * (minutesUsed - allottedMinutes);
    }

    public double calculateTotalBill() {
        return baseCost + calculateOverageFees() + calculateTax();
    }

    public void printBill() {
        System.out.println("Phone Bill Statement\n" +
                "ID: " + id + "\n" +
                "Base Cost: $" + String.format(Locale.ENGLISH,"%.2f", baseCost) + "\n" +
                "Overage Fees: $" + String.format(Locale.ENGLISH,"%.2f", calculateOverageFees()) + "\n" +
                "Tax: $" + String.format(Locale.ENGLISH,"%.2f", calculateTax()) + "\n" +
                "Total: $" + String.format(Locale.ENGLISH,"%.2f", calculateTotalBill()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
}
