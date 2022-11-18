package anaDers.day23inheritancepolymorphism;

public class Animal {
    public void eat() {
        System.out.println("Animal eats");

    }

    public int add(int a, int b) {
        return a + b;
    }
//asagıdakı metod: "Overridden Method"
    public Integer multiple(int a, int b) {
        return a * b;
    }
    public Animal creatae(){
        return new Animal();
    }


public final double divide(int a ,int b) {
    return a/b;
}
}