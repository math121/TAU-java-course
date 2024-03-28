package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake("Chocolate", 29.90);
        BirthdayCake birthdayCake = new BirthdayCake("Oreo", 40, 10);
        WeddingCake weddingCake = new WeddingCake("Vanilla", 70.75, 4);

        cake.printCakeDetails();
        birthdayCake.printCakeDetails();
        weddingCake.printCakeDetails();
    }
}
