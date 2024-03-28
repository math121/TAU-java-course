package chapter9;

public class Square extends Rectangle {
    public void print(String what) {
        System.out.println("I am a " + what);;
    }

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
