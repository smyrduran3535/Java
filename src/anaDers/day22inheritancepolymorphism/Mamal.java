package anaDers.day22inheritancepolymorphism;

public class Mamal extends Animal{
    public int a=13;
    public int b=34;

    public void eat(){
        System.out.println("Animal eat");
    }
    public void drink(){
        System.out.println("Animal drink");
    }
public Mamal(){
    System.out.println("Mamal");
}
}
