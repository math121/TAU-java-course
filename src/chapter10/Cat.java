package chapter10;

public class Cat extends Animal {

    public void scratch() {
        System.out.println("I am a cat. I scratch things.");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
