package tekrarlarım.AccessModifilerInherştence;

public class car extends Vehicle{
    public String color;
    int km;
    public car(){

    }
    public car(String color, int km){
        super("car");
        this.color=color;
        this.km=km;
        System.out.println("car consturactur");
    }
}
