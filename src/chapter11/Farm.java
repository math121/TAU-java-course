package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        //subclass makeSound methods
        pig.makeSound();
        duck.makeSound();

        //superclass eat method
        pig.eat();
        duck.eat();
    }
}
