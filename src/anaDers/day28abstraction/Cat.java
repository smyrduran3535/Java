package anaDers.day28abstraction;

public  class Cat extends Mammal{
    @Override
    public void eat() {

        System.out.println("Cats eat");
    }


    @Override
    public void move() {

        System.out.println("Cats move");
    }
}
