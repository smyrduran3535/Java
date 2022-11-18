package anaDers.day22inheritancepolymorphism;

public class honda extends Car {
    public String color;
    public honda(){
        super("White",54000);
        System.out.println("Honda Constuructor");
    }
    public honda(String colar){
        this.color=colar;
    }
}
