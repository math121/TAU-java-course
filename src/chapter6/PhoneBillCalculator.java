package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(90, 82.45, 10, 19);
        bill.printBill();

        PhoneBill bill2 = new PhoneBill(97);
        bill2.printBill();

        PhoneBill bill3 = new PhoneBill();
        bill3.printBill();
    }
}
