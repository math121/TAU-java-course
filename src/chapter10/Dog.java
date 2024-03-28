package chapter10;

public class Dog extends Animal {

    public void fetch() {
        System.out.println("Fetch is fun!");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
