package anaDers.day28abstraction;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Bird move");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
}
