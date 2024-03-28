package chapter10;

public class FruitMarket {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit apple = new Apple();
        Banana banana = new Banana();

        //Run makeJuice
        fruit.makeJuice();
        apple.makeJuice();
        banana.makeJuice();

        //Get calories
        System.out.println(fruit.getCalories());
        System.out.println(apple.getCalories());
        System.out.println(banana.getCalories());

        //Get fruit's subclass specific methods
        ((Apple) apple).removeSeeds();
        banana.peel();


    }
}
