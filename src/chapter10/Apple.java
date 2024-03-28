package chapter10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(200.5);
    }

    public void removeSeeds() {
        System.out.println("Removing seeds from apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}
